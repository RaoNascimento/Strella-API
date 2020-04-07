package br.com.AgendaAutonoma.agendaAutonomo.config.validacao.swagger;

import org.springframework.context.annotation.Bean;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Usuario;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfigurations {
	@Bean
	public Docket strelaApi() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage("br.com.AgendaAutonoma.agendaAutonoma"))
		.paths(PathSelectors.ant("/**"))
		.build()
		.ignoredParameterTypes(Usuario.class);
		
	}
}
