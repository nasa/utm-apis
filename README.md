# UTM APIs

This repository contains the collection of OpenAPI specification APIs within the NASA's research version of the UTM System.

Each directory contains files related to a single API.  Within each directory there is an additional README that provides further insight into that API.

## Some References

- [UTM Home Page](https://utm.arc.nasa.gov/)
- [UTM Publications](https://utm.arc.nasa.gov/documents.shtml)
- [UTM Swaggerhub](https://app.swaggerhub.com/organizations/utm)


## Codegen 

You can generate code from OpenAPI Specifications (swagger).  

Swagger Hub has a feature where the site will generate code into a zip file which is downloaded. 
This is a great first checkout, however, it uses the default language-specific configurations. 

One option (which we have used efficiently) is to generate all the data models into a library.
In Swagger code gen, code is be generated only from API Specifications, not directly from Swagger Domains.  
An approach to creating a model-only library is to generate against all the APIs whereby the generation 
output is filtered for model-only.

````````
GENERATE="java  -Dmodels -DmodelDocs=false -DapiDocs=false -jar $CODEGEN generate  -l spring --config config.json"
````````

Your language-specific configurations can also generate model-specific data validations

````````


{
  "library": "spring-boot",
  "java8": "true",
  "dateLibrary":"java8",
  "modelPackage": "gov.nasa.utm.utmcommons.model",
  "useBeanValidation":"true"
}

````````
