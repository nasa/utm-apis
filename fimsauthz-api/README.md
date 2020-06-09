# FIMS Authorization Server (FIMS-Authz) with Signature Authentication
This API provides an oauth2 token and other endpoints for the FIMS Authorization Server. The FIMS AZ Sig service implements the v1 API here https://github.com/nasa/utm-apis/blob/master/fimsauthz-api/fims-authz.yaml.  

## Message Signing and Signature Authentication

1. Client constructs the JWS


Client generates a JoseHeader and body with relevant data
Client constructs the JWS by base64 encoding the header and body, assigning it to the JWS's header and payload respectively.
Client generates the JWS signature by calculating the SHA-256 hash of the concatenated header and payload, and uses it's private key for the hashing.
Client assigns the generated the signature as the signature of the JWS object.

[Construction](./assets/jws1-construction.png)

2. Client requests AZ for an access_token


Client creates an HTTP request with the following configuration -
* request body set as the previously generated body
* request headers has a header called 'x-utm-message-signature' which is formed by concatenating the JWS's header and signature.

Clients sends this constructed request to AZ

[Get-token](./assets/jws2-request-token.png)

3.
FIMS-Authz re-constructs the JWS

[reconstruct](/assets/jws3-reconstruct-sig.png)

4.
FIMS-Authz Verifies Signature

Authz acquires client's public key from the JoseHeader, and verifies signature using the acquired key

[get-pubkey](./assets/jws4-get-pubkey.png)

# References
* [RFC 6749: OAuth 2.0](https://tools.ietf.org/html/rfc6749)
* [RFC 6750: OAuth Bearer Token Usage](https://tools.ietf.org/html/rfc6750)
* [RFC 7523: JSON Web Token](https://tools.ietf.org/html/rfc7519)
* [RFC 7523: JSON Web Token Profile for OAuth](https://tools.ietf.org/html/rfc7523)
* [RFC 7515: JSON Web Signature](https://tools.ietf.org/html/rfc7515)
* [OAuth Server Metadata](https://tools.ietf.org/html/draft-ietf-oauth-discovery-06)
* [RFC 7662: OAuth Token Introspection](https://tools.ietf.org/html/rfc7662)
* [Java Cryptography Architecture: Standard Names](http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html)
