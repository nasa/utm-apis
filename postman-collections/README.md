# Smoke Tests

Postman collections are provided with their credentials stripped.  Edit each collection to add the 
credentials. We also provide the URLs to our sandbox servers as CSV (or json) files. 

Newman can be used to run collections on the command line as shown here.  

If you are new to Postman, it consists of a builder and a collection runner, with many useful features. 

Postman will codegen from its javascript definition to other languages such as CURL.  If you are reporting a problem you can use Postman to demonstrate your problem, then sent your collection 
json, or codegen to CURL and send it in the body of your email.


### Sandbox URLs
``````
$ more tmi.csv 
prodUrl,authUrl
https://tmiserver.arc.nasa.gov,https://tmiserver.arc.nasa.gov

``````
### FIMS-OPS smoke
``````

 newman run FIMS-OPS.smoke.json --iteration-data ../../tmi.csv --timeout-request 1000 --insecure
 
→ FIMS-OPS version api
  GET https://tmiserver.arc.nasa.gov/fims/api [200 OK, 642B, 57ms]
  ✓  Status code is 200
 
→ authURL FIMS-OPS
  POST https://tmiserver.arc.nasa.gov/fimsAuthServer/oauth/token?grant_type=client_credentials [200 OK, 1.15KB, 153ms]
  ✓  Status code is 200
  ✓  Body contains Token
 
→ FIMS-OPS manage endpoint
  GET https://tmiserver.arc.nasa.gov/fims/manage/env [401 Unauthorized, 633B, 5ms]
 
┌─────────────────────────┬──────────┬──────────┐
│                         │ executed │   failed │
├─────────────────────────┼──────────┼──────────┤
│              iterations │        1 │        0 │
├─────────────────────────┼──────────┼──────────┤
│                requests │        3 │        0 │
├─────────────────────────┼──────────┼──────────┤
│            test-scripts │        3 │        0 │
├─────────────────────────┼──────────┼──────────┤
│      prerequest-scripts │        0 │        0 │
├─────────────────────────┼──────────┼──────────┤
│              assertions │        3 │        0 │
├─────────────────────────┴──────────┴──────────┤
│ total run duration: 397ms                     │
├───────────────────────────────────────────────┤
│ total data received: 1.01KB (approx)          │
├───────────────────────────────────────────────┤
│ average response time: 71ms                   │
└───────────────────────────────────────────────┘
ARSLA17020037:fims-ops issmith1$ more ../../tmi.csv
prodUrl,authUrl
https://tmiserver.arc.nasa.gov,https://tmiserver.arc.nasa.gov
 
``````
