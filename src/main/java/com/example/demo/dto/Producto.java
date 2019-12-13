package com.example.demo.dto;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name = "Productos")
public class Producto extends BaseEntity {

	private String nombre;
	private Double valor;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
