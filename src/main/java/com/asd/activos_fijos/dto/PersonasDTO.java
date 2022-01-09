package com.asd.activos_fijos.dto;

public class PersonasDTO {
//	@ApiModelProperty(value = "Código del trabajador")
	private String peLlave;
	
	private String peCodigo;
	
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
