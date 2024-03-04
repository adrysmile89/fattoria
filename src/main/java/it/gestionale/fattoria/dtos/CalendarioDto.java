package it.gestionale.fattoria.dtos;

import java.time.LocalDate;

public class CalendarioDto {

	private long id;
	private LocalDate data;
	private int uova;
	public CalendarioDto() {
	}
	public CalendarioDto(LocalDate data, int uova) {
		this.data = data;
		this.uova = uova;
	}
	public CalendarioDto(long id, LocalDate data, int uova) {
		this.id = id;
		this.data = data;
		this.uova = uova;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public int getUova() {
		return uova;
	}
	public void setUova(int uova) {
		this.uova = uova;
	}
	@Override
	public String toString() {
		return "CalendarioDto [id=" + id + ", data=" + data + ", uova=" + uova + "]";
	}
	
	
}
