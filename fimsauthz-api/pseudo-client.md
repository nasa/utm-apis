# Pseudo-Implementation for interfacing with FIMS-AZ

## Disclaimer
The following Python 3 snippet describes a possible implementation that a client of FIMS-AZ may reference to interface with FIMS-AZ to request a Bearer token.

__This is intended as an example only and not as an executable code segment.__

References: [UAS Service Supplier Framework for Authentication and Authorization](https://utm.arc.nasa.gov/docs/2019-UTM_Framework-NASA-TM220364.pdf)  
Author: NASA Ames Research Center, Aviation Systems Division

```python
from jwcrypto import jwk, jws                           # https://pypi.org/project/jwcrypto/
from jwcrypto.common import json_encode, json_decode
import requests                                         # https://pypi.org/project/requests/
import json

priv_key_path = "../path/to/my/priv_key.pem"
alg = "RS256"

# Read the private key file
with open(priv_key_path, "rb") as f:
    priv_key_file = f.read()

# Cast the private key file to a JWK
priv_key = jwk.JWK.from_pem(priv_key_file)

# Define the JOSE Header
jose_header = {
    "typ": "JOSE",
    "kid": "my_kid_here",
    "x5u": "https://example.com/.well-known/uas-traffic-management/public.der",
    "alg": alg,
}

# Define the Payload of the JWS -
# - As defined by UFAA, the payload must be equal to the HTTP body. The request body / JWS payload must be URL encoded.
# - current_timestamp must adhere to the timestamp model described as per - https://github.com/nasa/utm-apis/blob/master/utm-domains/utm-domain-commons.yaml#L45
payload = "grant_type=client_credentials&client_id=example.com&scope=example.scope.read&audience=the-dss.co&current_timestamp=2020-06-19T13%3A37%3A52.562Z"

# Generate the JWS
my_jws = jws.JWS(payload)

# Sign the JWS with the private key
my_jws.add_signature(priv_key, alg, json_encode(jose_header))

# Decode the signed JWS into a JSON
signed_jws = my_jws.serialize()
signed_jws_json = json_decode(signed_jws)

# Create the x-utm-message-signature by eliminating the payload element of the signed JWS
x_utm_message_signature = (
    signed_jws_json["protected"] + ".." + signed_jws_json["signature"]
)

# Define the required HTTP Request headers
headers = {
    "content-type": "application/x-www-form-urlencoded",
    "x-utm-message-signature": x_utm_message_signature,
    "User-Agent": "AZ_EXAMPLE_CLIENT",
}

# Send request FIMS-AZ
r = requests.post(
    url="https://example.com/fims/v1/token/",
    data=payload,  # As defined by UFAA, the payload must be equal to the HTTP body
    headers=headers,
)
```