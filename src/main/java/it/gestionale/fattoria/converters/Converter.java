package it.gestionale.fattoria.converters;

import java.util.List;
import java.util.stream.Collectors;

import it.gestionale.fattoria.dtos.CalendarioDto;
import it.gestionale.fattoria.entities.CalendarioEntity;

public class Converter {

	public static CalendarioDto fromEntityToDto(CalendarioEntity entity) {
		
		return new CalendarioDto(entity.getId(),entity.getData(),entity.getUova());
	}
	
	public static CalendarioEntity fromDtoToEntity(CalendarioDto dto) {
		
		return new CalendarioEntity(dto.getId(),dto.getData(),dto.getUova());
	}
	
	public static List<CalendarioDto> fromListEntityToListDto(List<CalendarioEntity> list){
		
		return  list.stream().map(x -> fromEntityToDto(x)).collect(Collectors.toList());
	}
	public static List<CalendarioEntity> fromListDtoToListEntity(List<CalendarioDto> list){
		
		return list.stream().map(x -> fromDtoToEntity(x)).collect(Collectors.toList());
	}
}
