/**
 * 
 */
package it.gestionale.fattoria.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class FattoriaCtrl {

	@GetMapping
	public ResponseEntity<String> fattoria(){
		return ResponseEntity.ok("Fattoria è funzionante.");
	}
}
