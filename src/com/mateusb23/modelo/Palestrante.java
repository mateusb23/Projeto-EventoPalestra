package com.mateusb23.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "palestrante_seq", sequenceName = "palestrante_seq", allocationSize = 1 ,initialValue = 1)
public class Palestrante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "palestrante_seq")
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "mini_bio")
	private String miniBio;
	@ManyToOne
	private Palestra palestra;
	
	public Palestrante() { }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMiniBio() {
		return miniBio;
	}

	public void setMiniBio(String miniBio) {
		this.miniBio = miniBio;
	}

	public Palestra getPalestra() {
		return palestra;
	}

	public void setPalestra(Palestra palestra) {
		this.palestra = palestra;
	}
	
}
