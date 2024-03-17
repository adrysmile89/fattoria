package it.gestionale.fattoria.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="calendario")
public class CalendarioEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="data" , nullable=false, unique=true)
	private LocalDate data =LocalDate.now();
	@Column(name="uova" , nullable=false, unique=false)
	private int uova =0;
	public CalendarioEntity() {
	}
	public CalendarioEntity(Long id, LocalDate data, int uova) {
		this.id = id;
		this.data = data;
		this.uova = uova;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
		return "CalendarioEntity [id=" + id + ", data=" + data + ", uova=" + uova + "]";
	}
	
	
	
}
