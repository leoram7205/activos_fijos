package com.asd.activos_fijos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ciudades")
public class Ciudades {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ci_llave", columnDefinition = "VARCHAR(36)")
	private String ciLlave;
	
	@Column(name = "ci_codigo", columnDefinition = "VARCHAR(15)")
	private String ciCodigo;
	
	@Column(name = "ci_nombre", columnDefinition = "VARCHAR(50)")
	private String ciNombre;

	public String getCiLlave() {
		return ciLlave;
	}

	public void setCiLlave(String ciLlave) {
		this.ciLlave = ciLlave;
	}

	public String getCiCodigo() {
		return ciCodigo;
	}

	public void setCiCodigo(String ciCodigo) {
		this.ciCodigo = ciCodigo;
	}

	public String getCiNombre() {
		return ciNombre;
	}

	public void setCiNombre(String ciNombre) {
		this.ciNombre = ciNombre;
	}

}
