package com.atividade.aula.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springDocOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("API Restful com Documentação")
                        .description("Documentação da API Employee utilizando springdoc para documentação")
                        .version("1.1.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Link do Repositório da Aplicação - APIRestful Documentation")
                        .url("https://github.com/OLuiz-Daniel/api_funcionarios"));
    }
}
