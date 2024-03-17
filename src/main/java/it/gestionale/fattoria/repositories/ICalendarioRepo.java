package it.gestionale.fattoria.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import it.gestionale.fattoria.entities.CalendarioEntity;


public interface ICalendarioRepo extends JpaRepository<CalendarioEntity, Long>{
	
	CalendarioEntity findByData(LocalDate data);
}
