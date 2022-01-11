package com.asd.activos_fijos.dto;

public enum EstadosActivoEnum {
	ACTIVO("Activo"), 
	DADO_DE_BAJA("Dado de baja"),
	EN_REPARACION("En reparación"),
	DISPONIBLE("Disponible"),
	ASIGNADO("Asignado");

	private String estado;

    EstadosActivoEnum(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

}
