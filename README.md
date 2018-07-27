# UTM APIs

This repository contains the collection of OpenAPI specification APIs within the NASA's research version of the UTM System.  Many of UTM's data models are common and these are maintained using Swagger's "Domain" references.

## References

- [UTM Home Page](https://utm.arc.nasa.gov/)
- [UTM Publications](https://utm.arc.nasa.gov/documents.shtml)
- [UTM Swaggerhub](https://app.swaggerhub.com/organizations/utm)


## Sandbox and RELEASE branch

utm-apis commits pinned to our Sandbox are represented in the RELEASE branch, and the master branch is our development branch.  You will generally find the master branch to be ahead of the Sandbox.  The tags in RELEASE correspond with our sandbox releases.

For codegen you generally will point to RELEASE.  


## Viewing Local Swagger Spec files

You have choices to edit/view local swagger files. IMO option 1 is better for viewing all files.  A local swagger editor is good if you want rendering.

1. Use a text editor that supports YAML:
  - Sublime Text 2 highlights YAML well
  - [Atom](https://atom.io/) works well and has a [Swagger Lint Plugin](https://atom.io/packages/linter-swagger) that provides a good first cut at valid OpenAPI 2.0 correctness

2. Install local [Swagger Editor](https://swagger.io/swagger-editor/)

3. Bring up an [online swagger editor](https://editor.swagger.io/) and copy or import the source swagger.


## Codegen

You can generate code from OpenAPI Specifications (swagger).  

Swagger Hub has a feature where the site will generate code into a zip file which is downloaded.  This is a great first checkout, however, it uses the default language-specific configurations.

One option (which we use) is to generate all the data models into a library.
Note that codegen parses only from API Specifications, not directly from Swagger Domains.  
An approach to creating a model-only library is to codegen against all the APIs whereby the generation
output is filtered for model-only.
The argument to the input spec can be a local file or internet

````````
GENERATE="java  -Dmodels -DmodelDocs=false -DapiDocs=false -jar $CODEGEN generate  -l spring --config config.json"

$GENERATE -i ${SWREPO}/fims-uss-api/swagger.yaml   #localfile input
or
$GENERATE -i https://raw.githubusercontent.com/nasa/utm-apis/master/uss-api/swagger.yaml

````````

Your language-specific configurations can also generate model-specific data validations.
For example using swagger-codegen's 'Spring server' language you can codegen bean validations
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
