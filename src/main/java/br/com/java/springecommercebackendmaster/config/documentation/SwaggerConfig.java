package br.com.java.springecommercebackendmaster.config.documentation;

import org.springframework.context.annotation.*;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                   .apiInfo(getApiInfo())
                   .select()
                   .apis(RequestHandlerSelectors.basePackage("br.com.java"))
                   .paths(PathSelectors.any())
                   .build();
    }

    private ApiInfo getApiInfo() {
        Contact contact = new Contact("Diego Pereira", "http://github.com/diegotpereira", "diegoteixeirapereira@hotmail.com");
        return new ApiInfoBuilder()
                .title("Ecommerce API Master")
                .description("Documentation Ecommerce api")
                .version("1.0.0")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .contact(contact)
                .build();
    }
}
