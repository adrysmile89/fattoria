/**
 * 
 */
package it.gestionale.fattoria.controllers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.gestionale.fattoria.dtos.CalendarioDto;

/**
 * 
 */
@RestController
public class FattoriaCtrl {

	@GetMapping
	public ResponseEntity<String> fattoria(){
		return ResponseEntity.ok("Fattoria è funzionante.");
	}
	
	List<CalendarioDto> outList=Arrays.asList(new CalendarioDto(0,LocalDate.now(),2),new CalendarioDto(0,LocalDate.of(2024, 3, 3),7));
	
	@GetMapping(value="all", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CalendarioDto>> getCalendario(){
		
		return ResponseEntity.ok(outList);
	}
}
