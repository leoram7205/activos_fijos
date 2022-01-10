package com.asd.activos_fijos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="tipo_activo")
public class TipoActivo {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ta_llave", columnDefinition = "VARCHAR(36)")
	private String taLlave;
	
	@Column(name = "ta_codigo", columnDefinition = "VARCHAR(15)")
	private String taCodigo;
	
	@Column(name = "ta_nombre", columnDefinition = "VARCHAR(50)")
	private String taNombre;

	public String getTaLlave() {
		return taLlave;
	}

	public void setTaLlave(String taLlave) {
		this.taLlave = taLlave;
	}

	public String getTaCodigo() {
		return taCodigo;
	}

	public void setTaCodigo(String taCodigo) {
		this.taCodigo = taCodigo;
	}

	public String getTaNombre() {
		return taNombre;
	}

	public void setTaNombre(String taNombre) {
		this.taNombre = taNombre;
	}
	
}
