package com.asd.activos_fijos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="articulos")
public class Articulos {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "at_llave", columnDefinition = "VARCHAR(36)")
	private String atLlave;
	
	@Column(name = "at_codigo", columnDefinition = "VARCHAR(21)")
	private String atCodigo;
	
	@Column(name = "at_nombre", columnDefinition = "VARCHAR(50)")
	private String atNombre;

	public String getAtLlave() {
		return atLlave;
	}

	public void setAtLlave(String atLlave) {
		this.atLlave = atLlave;
	}

	public String getAtCodigo() {
		return atCodigo;
	}

	public void setAtCodigo(String atCodigo) {
		this.atCodigo = atCodigo;
	}

	public String getAtNombre() {
		return atNombre;
	}

	public void setAtNombre(String atNombre) {
		this.atNombre = atNombre;
	}
	
}
