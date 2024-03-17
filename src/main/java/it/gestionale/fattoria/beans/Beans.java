package it.gestionale.fattoria.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.gestionale.fattoria.servicies.CalendarioService;

@Configuration
public class Beans {

	@Bean("service")
	public CalendarioService setService() {
		return new CalendarioService();
	}
	
	
	
}
