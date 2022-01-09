package com.asd.activos_fijos.dto;

public class AreasDTO {
//	@ApiModelProperty(value = "Código del trabajador")	
	private String arLlave;
	
	private String arCodigo;
	
	private String arNombre;
	
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
