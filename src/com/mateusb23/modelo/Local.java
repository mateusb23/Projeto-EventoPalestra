package com.mateusb23.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "local_seq", sequenceName = "local_seq", allocationSize = 1, initialValue = 1)
public class Local {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "local_seq")
	private Long id;
	@Column(name = "predio")
	private String predio;
	@Column(name = "sala")
	private String sala;
	@Column(name = "capacidade")
	private int capacidade;
	
	public Local() { }
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPredio() {
		return predio;
	}
	
	public void setPredio(String predio) {
		this.predio = predio;
	}
	
	public String getSala() {
		return sala;
	}
	
	public void setSala(String sala) {
		this.sala = sala;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
}
