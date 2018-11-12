# UTM APIs

This repository contains the collection of OpenAPI specification APIs for the UTM research platform.

## References

- [UTM Home Page](https://utm.arc.nasa.gov/)
- [UTM Publications](https://utm.arc.nasa.gov/documents.shtml)
- [UTM Swaggerhub](https://app.swaggerhub.com/organizations/utm)
- [TCL4 production Authz Server](https://utmalpha.arc.nasa.gov/fimsAuthServer/api)


##  Server and API versions

UTM server versions are returned by the 'api' endpoint.  For example the TCL4 production Authz Server ['apis' endpoint](https://utmalpha.arc.nasa.gov/fimsAuthServer/api) will show the server version is 'v18.08.02'.  This endpoint also returns a list of implemented APIs.

API versions are defined by a utm-apis repo commit ID corresponding to either the tip of a branch or a tag.

For swagger-codegen, the branch/tag strategy is specified elsewhere, likely slack.  Possible TCL4 branch/tag strategies are:
* codegen from tip of the development branch 'v4-draft'
* codegen from a tag  (which is likely on the v4-draft branch)

## Viewing Local Swagger Spec files

You have choices to edit/view local swagger files. IMO option 1 is better for viewing all files.  A local swagger editor is good if you want rendering.

1. Use a text editor that supports YAML:
  - Sublime Text 2 highlights YAML well
  - [Atom](https://atom.io/) works well and has a [Swagger Lint Plugin](https://atom.io/packages/linter-swagger) that provides a good first cut at valid OpenAPI 2.0 correctness

2. Install local [Swagger Editor](https://swagger.io/swagger-editor/)

3. Bring up an [online swagger editor](https://editor.swagger.io/) and copy or import the source swagger.


## Codegen

You can generate code from OpenAPI Specifications (swagger).

Swagger Hub has a feature where the site will generate code into a zip file which is downloaded.  This is a great first glance, however, it uses the default language-specific configurations.

We generate all the data models into a library.  The swagger-codegen triggers through API Spec files, not directly from Swagger Domain files. Thus to create a model-only library we codegen against all the API specs whereby the generation
output is filtered for model-only. The argument to the input spec can be a local file or internet

````````
GENERATE="java  -Dmodels -DmodelDocs=false -DapiDocs=false -jar $CODEGEN generate  -l spring --config config.json"

$GENERATE -i ${SWREPO}/fims-uss-api/swagger.yaml   #localfile input
or
$GENERATE -i https://raw.githubusercontent.com/nasa/utm-apis/v4-draft/uss-api/swagger.yaml

````````

Your language-specific configurations can also generate model-specific data validations. For example using swagger-codegen's 'Spring server' language you can codegen bean validations and java8's OffsetDateTime class for date-time using this language-specific config.

````````

{
  "library": "spring-boot",
  "java8": "true",
  "dateLibrary":"java8",
  "modelPackage": "gov.nasa.utm.utmcommons.model",
  "useBeanValidation":"true"
}

````````
