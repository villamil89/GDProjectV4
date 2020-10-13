package com.sdis.gdproject.model.dto;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ParticipanteDTO")
public class ParticipanteDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "numeroDocIdent")
	private java.lang.String numeroDocIdent;
	@org.kie.api.definition.type.Label(value = "tipoDocIdent")
	private java.lang.String tipoDocIdent;
	@org.kie.api.definition.type.Label(value = "primerApellido")
	private java.lang.String primerApellido;
	@org.kie.api.definition.type.Label(value = "primerNombre")
	private java.lang.String primerNombre;
	@org.kie.api.definition.type.Label(value = "segundoApellido")
	private java.lang.String segundoApellido;
	@org.kie.api.definition.type.Label(value = "segundoNombre")
	private java.lang.String segundoNombre;
	@org.kie.api.definition.type.Label(value = "edad")
	private java.lang.Integer edad;
	@org.kie.api.definition.type.Label(value = "relacion")
	private java.lang.String relacion;
	@org.kie.api.definition.type.Label(value = "datosContacto")
	private com.sdis.gdproject.model.dto.DatosContactoDTO datosContacto;

	public ParticipanteDTO() {
	}

	public java.lang.String getNumeroDocIdent() {
		return this.numeroDocIdent;
	}

	public void setNumeroDocIdent(java.lang.String numeroDocIdent) {
		this.numeroDocIdent = numeroDocIdent;
	}

	public java.lang.String getTipoDocIdent() {
		return this.tipoDocIdent;
	}

	public void setTipoDocIdent(java.lang.String tipoDocIdent) {
		this.tipoDocIdent = tipoDocIdent;
	}

	public java.lang.String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(java.lang.String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public java.lang.String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(java.lang.String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public java.lang.String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(java.lang.String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public java.lang.String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(java.lang.String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public java.lang.Integer getEdad() {
		return this.edad;
	}

	public void setEdad(java.lang.Integer edad) {
		this.edad = edad;
	}

	public java.lang.String getRelacion() {
		return this.relacion;
	}

	public void setRelacion(java.lang.String relacion) {
		this.relacion = relacion;
	}

	public com.sdis.gdproject.model.dto.DatosContactoDTO getDatosContacto() {
		return this.datosContacto;
	}

	public void setDatosContacto(
			com.sdis.gdproject.model.dto.DatosContactoDTO datosContacto) {
		this.datosContacto = datosContacto;
	}

	public ParticipanteDTO(java.lang.String numeroDocIdent,
			java.lang.String tipoDocIdent, java.lang.String primerApellido,
			java.lang.String primerNombre, java.lang.String segundoApellido,
			java.lang.String segundoNombre, java.lang.Integer edad,
			java.lang.String relacion,
			com.sdis.gdproject.model.dto.DatosContactoDTO datosContacto) {
		this.numeroDocIdent = numeroDocIdent;
		this.tipoDocIdent = tipoDocIdent;
		this.primerApellido = primerApellido;
		this.primerNombre = primerNombre;
		this.segundoApellido = segundoApellido;
		this.segundoNombre = segundoNombre;
		this.edad = edad;
		this.relacion = relacion;
		this.datosContacto = datosContacto;
	}

}