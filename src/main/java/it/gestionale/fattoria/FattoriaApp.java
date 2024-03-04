/**
 * 
 */
package it.gestionale.fattoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 */
@SpringBootApplication(scanBasePackages = "it.gestionale.fattoria")
@ComponentScan(basePackages = "it.gestionale.fattoria.controllers")
public class FattoriaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(FattoriaApp.class, args);

	}

}
