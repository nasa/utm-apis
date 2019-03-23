# USS API

## Operational States


![alt text](diagrams/tcl4-statemachine.png "Operational States")

## Finding validations from swagger spec which are stated in free text with a MUST.

curl --silent  -o commons.yml  https://raw.githubusercontent.com/nasa/utm-apis/v4-draft/utm-domains/utm-domain-commons.yaml && grep  MUST commons.yml
This is a swagger JSON built by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.
