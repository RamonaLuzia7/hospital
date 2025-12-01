package com.senai.backend.hospital.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Hospital tem vida",
        version = "1.0",
        description = "ramonaluzia17@gmail.com"
    )
)
public class Swagger {

}