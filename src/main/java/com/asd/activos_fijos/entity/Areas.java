package com.asd.activos_fijos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="areas")
public class Areas {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ar_llave", columnDefinition = "VARCHAR(36)")
	private String arLlave;
	
	@Column(name = "ar_codigo", columnDefinition = "VARCHAR(15)")
	private String arCodigo;
	
	@Column(name = "ar_nombre", columnDefinition = "VARCHAR(50)")
	private String arNombre;
	
	@Column(name = "ar_ciudad", columnDefinition = "VARCHAR(36)")
	private String arCiudad;

	public String getArLlave() {
		return arLlave;
	}

	public void setArLlave(String arLlave) {
		this.arLlave = arLlave;
	}

	public String getArCodigo() {
		return arCodigo;
	}

	public void setArCodigo(String arCodigo) {
		this.arCodigo = arCodigo;
	}

	public String getArNombre() {
		return arNombre;
	}

	public void setArNombre(String arNombre) {
		this.arNombre = arNombre;
	}

	public String getArCiudad() {
		return arCiudad;
	}

	public void setArCiudad(String arCiudad) {
		this.arCiudad = arCiudad;
	}

}
