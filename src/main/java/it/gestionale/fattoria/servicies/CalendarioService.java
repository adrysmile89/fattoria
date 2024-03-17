package it.gestionale.fattoria.servicies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionale.fattoria.converters.Converter;
import it.gestionale.fattoria.dtos.CalendarioDto;
import it.gestionale.fattoria.entities.CalendarioEntity;
import it.gestionale.fattoria.repositories.ICalendarioRepo;
@Service
public class CalendarioService implements ICalendarioService{

	@Autowired
	ICalendarioRepo repo;
	
	@Override
	public CalendarioDto create(CalendarioDto calendario) {
		CalendarioEntity ce =Converter.fromDtoToEntity(calendario);
		ce = repo.save(ce);
		return Converter.fromEntityToDto(ce);
	}

	@Override
	public List<CalendarioDto> findAll() {
		List<CalendarioEntity> out =new ArrayList<>();
		repo.findAll().forEach( x -> out.add(x));
		
		return Converter.fromListEntityToListDto(out);
	}

	@Override
	public CalendarioDto findByData(LocalDate data) {
		CalendarioEntity ce=repo.findByData(data);
		return Converter.fromEntityToDto(ce);
	}


	

}
