# UTM APIs

This repository contains the collection of OpenAPI specification APIs within the NASA's research version of the UTM System.

Each directory contains files related to a single API.  Within each directory there is an additional README that provides further insight into that API.

adding a line to see if I can MD 11/19/17 from home without firewalls blocking things
adding a line to see if I can edit from carbon on 11/20/17
adding a line to see if I can edit from marycomp on 11/20/17

## References

- [UTM Home Page](https://utm.arc.nasa.gov/)
- [UTM Publications](https://utm.arc.nasa.gov/documents.shtml)
- [UTM Swaggerhub](https://app.swaggerhub.com/organizations/utm)


## Sandbox and Swaggerhub-github versions

utm-apis release branch is SWAGGERHUB and the master branch is our development branch.  You will generally find the master branch to be ahead of the Sandbox.  The tags in our SWAGGERHUB branch correspond with our sandbox releases.

utm-apis repo's master branch is tagged with a release tag.  The same tag is applied to the UTM Sandbox deployment. 
For example the v17.10 sandbox was generated from github branch/tag swagger17.10.

Swaggerhub's master branch can sometimes be ahead of our sandbox.

For codegen you can point back in history to the release tag.  You can also clone the utm-apis to your build machine, and view local specs, as below.



## Viewing Local Spec files

You have choices to edit/view local swagger files. IMO option 1 is better for viewing all files.  A local swagger editor is good if you want rendering. 

1. Use a text editor that supports YAML such as Sublime Text 2.

2. Install node.js local [Swagger Editor](https://swagger.io/swagger-editor/) and run using 'http-server swagger-editor'


3. Bring up an online swagger editor and copy entire file contents into your browser


## Codegen 

You can generate code from OpenAPI Specifications (swagger).  

Swagger Hub has a feature where the site will generate code into a zip file which is downloaded. 
This is a great first checkout, however, it uses the default language-specific configurations. 

One option (which we have used efficiently) is to generate all the data models into a library.
In Swagger code gen, code is be generated only from API Specifications, not directly from Swagger Domains.  
An approach to creating a model-only library is to generate against all the APIs whereby the generation 
output is filtered for model-only.
The argument to the input spec can be a local file or internet

````````
GENERATE="java  -Dmodels -DmodelDocs=false -DapiDocs=false -jar $CODEGEN generate  -l spring --config config.json"

$GENERATE -i ${SWREPO}/fims-uss-api/swagger.yaml   #localfile input
or
$GENERATE -i https://raw.githubusercontent.com/nasa/utm-apis/master/uss-api/swagger.yaml

````````

Your language-specific configurations can also generate model-specific data validations.
For example for swagger-codegen's 'Spring server' language you can codegen bean validations
and java8's OffsetDateTime class for date-time using this language-specific config. 

````````

{
  "library": "spring-boot",
  "java8": "true",
  "dateLibrary":"java8",
  "modelPackage": "gov.nasa.utm.utmcommons.model",
  "useBeanValidation":"true"
}

````````

### Pulling a back-version of Swagger Spec

To codegen from local swagger specs, the local files need to be "resolved"  whereby
all domain references are resolved.  (Because the refs point to master/HEAD. This will result in mixed versions. 

`````````
CODEGEN=./lib/swagger-codegen-cli-2.2.3.jar
GENERATE="java  -Dmodels -DmodelDocs=false -DapiDocs=false -jar $CODEGEN generate  -l spring --config config.json"
RLSTAG="v17.11."

$GENERATE -i https://raw.githubusercontent.com/nasa/utm-apis/${RLSTAG}/uss-api/swagger.yaml
```````
