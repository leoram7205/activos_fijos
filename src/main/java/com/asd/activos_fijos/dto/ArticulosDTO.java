package com.asd.activos_fijos.dto;

public class ArticulosDTO {
//	@ApiModelProperty(value = "Código del trabajador")
	private String atLlave;
	
	private String atCodigo;
	
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
