package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-15T16:53:28.339Z")

@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("UTM SDSP Service Discovery")
            .description("This API describes the RESTful interface to the Supplemental Data Service  Provider discovery service within the UTM System.  This service allows for  stakeholders to register and discovery data services that support UAS operations.")
            .license("NASA Open Source Agreement")
            .licenseUrl("https://ti.arc.nasa.gov/opensource/nosa/")
            .termsOfServiceUrl("https://utm.arc.nasa.gov/")
            .version("v1")
            .contact(new Contact("","", "joseph.rios@nasa.gov"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
