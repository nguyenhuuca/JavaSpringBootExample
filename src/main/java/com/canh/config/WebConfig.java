package com.canh.config;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class WebConfig extends WebMvcAutoConfigurationAdapter {
	@Bean
	public Docket managementDocket(){
		return new Docket(DocumentationType.SWAGGER_2).groupName("my-project").apiInfo(apiInfo()).select().paths( PathSelectors.regex("/.*")).build();
	}

	private ApiInfo apiInfo(){
		return new ApiInfoBuilder().title("My-project").description("Document for API").termsOfServiceUrl("https://canh1412.wordpress.com/").contact("Canh").license("Proprietary").licenseUrl("https://canh1412.wordpress.com/").version("1.0").build();
	}

}