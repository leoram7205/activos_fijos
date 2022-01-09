package com.asd.activos_fijos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="personas")
public class Personas {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "pe_llave", columnDefinition = "VARCHAR(36)")
	private String peLlave;
	
	@Column(name = "pe_codigo", columnDefinition = "VARCHAR(15)")
	private String peCodigo;
	
	@Column(name = "pe_nombre", columnDefinition = "VARCHAR(50)")
	private String peNombre;

	public String getPeLlave() {
		return peLlave;
	}

	public void setPeLlave(String peLlave) {
		this.peLlave = peLlave;
	}

	public String getPeCodigo() {
		return peCodigo;
	}

	public void setPeCodigo(String peCodigo) {
		this.peCodigo = peCodigo;
	}

	public String getPeNombre() {
		return peNombre;
	}

	public void setPeNombre(String peNombre) {
		this.peNombre = peNombre;
	}
	
}
