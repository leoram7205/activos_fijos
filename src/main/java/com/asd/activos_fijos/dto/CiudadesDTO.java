package com.asd.activos_fijos.dto;

public class CiudadesDTO {
//	@ApiModelProperty(value = "Código del trabajador")
	private String ciLlave;
	
	private String ciCodigo;
	
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
