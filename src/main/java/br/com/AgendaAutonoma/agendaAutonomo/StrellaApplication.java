package br.com.AgendaAutonoma.agendaAutonomo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport 
public class StrellaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrellaApplication.class, args);
	}

}
