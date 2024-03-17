package it.gestionale.fattoria.servicies;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import it.gestionale.fattoria.dtos.CalendarioDto;

@Service
public interface ICalendarioService  {

	public CalendarioDto create(CalendarioDto calendario);
	public List<CalendarioDto> findAll();
	
	public CalendarioDto findByData(LocalDate data);
}
