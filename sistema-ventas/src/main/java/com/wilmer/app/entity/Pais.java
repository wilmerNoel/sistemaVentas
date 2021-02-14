package com.wilmer.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pais")
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPais;
	
	@Column(length = 50)
	private String nombre;

	public Long getIdPais() {
		return idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
