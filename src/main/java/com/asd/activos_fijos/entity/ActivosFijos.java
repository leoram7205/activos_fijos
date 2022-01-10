package com.asd.activos_fijos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="activos_fijos")
public class ActivosFijos {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "af_llave", columnDefinition = "VARCHAR(36)")
	private String afLlave;
	
	@Column(name = "af_codigo", columnDefinition = "VARCHAR(15)")
	private String afCodigo;
	
	@Column(name = "af_nombre", columnDefinition = "VARCHAR(50)")
	private String afNombre;
	
	@Column(name = "af_descripcion", columnDefinition = "VARCHAR(100)")
	private String afDescripcion;
	
	@Column(name = "af_tipoactivo", columnDefinition = "VARCHAR(36)")
	private String afTipoActivo;
	
	@Column(name = "af_serial", columnDefinition = "VARCHAR(20)")
	private String afSerial;
	
	@Column(name = "af_numeroinventario", columnDefinition = "VARCHAR(100)")
	private String afNumeroInventario;
	
	@Column(name = "af_peso", columnDefinition = "NUMERIC")
	private Double afPeso;
	
	@Column(name = "af_alto", columnDefinition = "NUMERIC")
	private Double afAlto;
	
	@Column(name = "af_ancho", columnDefinition = "NUMERIC")
	private Double afAncho;
	
	@Column(name = "af_largo", columnDefinition = "NUMERIC")
	private Double afLargo;
	
	@Column(name = "af_fechacompra", columnDefinition = "DATE")
	private Date afFechaCompra;
	
	@Column(name = "af_valorcompra", columnDefinition = "NUMERIC")
	private Double afValorCompra;
	
	@Column(name = "af_fechabaja", columnDefinition = "DATE")
	private Date afFechaBaja;
	
	@Column(name = "af_estadoactual", columnDefinition = "VARCHAR(15)")
	private String afEstadoActual;
	
	@Column(name = "af_color", columnDefinition = "VARCHAR(30)")
	private String afColor;
	
	@Column(name = "af_asignado", columnDefinition = "VARCHAR(36)")
	private String afAsignado;
	
	@Column(name = "af_areaasignada", columnDefinition = "VARCHAR(36)")
	private String afAreaAsignada;

	public String getAfLlave() {
		return afLlave;
	}

	public void setAfLlave(String afLlave) {
		this.afLlave = afLlave;
	}

	public String getAfCodigo() {
		return afCodigo;
	}

	public void setAfCodigo(String afCodigo) {
		this.afCodigo = afCodigo;
	}

	public String getAfNombre() {
		return afNombre;
	}

	public void setAfNombre(String afNombre) {
		this.afNombre = afNombre;
	}

	public String getAfDescripcion() {
		return afDescripcion;
	}

	public void setAfDescripcion(String afDescripcion) {
		this.afDescripcion = afDescripcion;
	}

	public String getAfTipoActivo() {
		return afTipoActivo;
	}

	public void setAfTipoActivo(String afTipoActivo) {
		this.afTipoActivo = afTipoActivo;
	}

	public String getAfSerial() {
		return afSerial;
	}

	public void setAfSerial(String afSerial) {
		this.afSerial = afSerial;
	}

	public String getAfNumeroInventario() {
		return afNumeroInventario;
	}

	public void setAfNumeroInventario(String afNumeroInventario) {
		this.afNumeroInventario = afNumeroInventario;
	}

	public Double getAfPeso() {
		return afPeso;
	}

	public void setAfPeso(Double afPeso) {
		this.afPeso = afPeso;
	}

	public Double getAfAlto() {
		return afAlto;
	}

	public void setAfAlto(Double afAlto) {
		this.afAlto = afAlto;
	}

	public Double getAfAncho() {
		return afAncho;
	}

	public void setAfAncho(Double afAncho) {
		this.afAncho = afAncho;
	}

	public Double getAfLargo() {
		return afLargo;
	}

	public void setAfLargo(Double afLargo) {
		this.afLargo = afLargo;
	}

	public Date getAfFechaCompra() {
		return afFechaCompra;
	}

	public void setAfFechaCompra(Date afFechaCompra) {
		this.afFechaCompra = afFechaCompra;
	}

	public Double getAfValorCompra() {
		return afValorCompra;
	}

	public void setAfValorCompra(Double afValorCompra) {
		this.afValorCompra = afValorCompra;
	}

	public Date getAfFechaBaja() {
		return afFechaBaja;
	}

	public void setAfFechaBaja(Date afFechaBaja) {
		this.afFechaBaja = afFechaBaja;
	}

	public String getAfEstadoActual() {
		return afEstadoActual;
	}

	public void setAfEstadoActual(String afEstadoActual) {
		this.afEstadoActual = afEstadoActual;
	}

	public String getAfColor() {
		return afColor;
	}

	public void setAfColor(String afColor) {
		this.afColor = afColor;
	}

	public String getAfAsignado() {
		return afAsignado;
	}

	public void setAfAsignado(String afAsignado) {
		this.afAsignado = afAsignado;
	}

	public String getAfAreaAsignada() {
		return afAreaAsignada;
	}

	public void setAfAreaAsignada(String afAreaAsignada) {
		this.afAreaAsignada = afAreaAsignada;
	}

}
