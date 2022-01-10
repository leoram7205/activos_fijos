package com.asd.activos_fijos.exception;

public class PortalException extends Exception {
	private static final long serialVersionUID = 1L;
	private final LogRefServicios logRefServicios;

	public PortalException(LogRefServicios logRefServicios, String mensaje) {
		super(mensaje);
		this.logRefServicios = logRefServicios;
	}

	public PortalException(LogRefServicios logRefServicios, String mensaje, Throwable cause) {
		super(mensaje, cause);
		this.logRefServicios = logRefServicios;
	}

	public String getLogRef() {
		return this.logRefServicios.getLogRef();
	}

	public String getHrefLink() {
		return this.logRefServicios.getHrefLink();
	}

	public LogRefServicios getLogRefServicios() {
		return logRefServicios;
	}
}
