package com.example.demo.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Facturas")
public class Factura {

	@Id
	private String id;
	
	private Double total;
	
	private String cliente;
	
	private Long telefono;
	
	@OneToMany(targetEntity = Item.class)
	List<Item> item;
	
}
