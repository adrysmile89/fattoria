/**
 * 
 */
package it.gestionale.fattoria.controllers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.gestionale.fattoria.dtos.CalendarioDto;
import it.gestionale.fattoria.servicies.ICalendarioService;

/**
 * 
 */
@RestController
@CrossOrigin("http://localhost:3000/")
public class FattoriaCtrl {

	@Autowired
	private ICalendarioService service;
	
	List<CalendarioDto> outList=Arrays.asList(new CalendarioDto(0,LocalDate.now(),2),
			new CalendarioDto(1,LocalDate.of(2024, 3, 3),7),
			new CalendarioDto(2,LocalDate.of(2024, 3, 8),3));
	
	@GetMapping
	public ResponseEntity<String> fattoria(){
		return ResponseEntity.ok("Fattoria è funzionante.");
	}
	

	@GetMapping(value="all", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CalendarioDto>> getCalendario(){

		
		return ResponseEntity.ok(service.findAll());
	}
	
	@PostMapping(value="add",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<CalendarioDto> add(@RequestBody CalendarioDto calendario){
		
		return ResponseEntity.ok(service.create(calendario));
	}
}
