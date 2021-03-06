package com.sdis.gdproject.model.dto;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ArchivoAdjuntoDTO")
public class ArchivoAdjuntoDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("mimeType")
	private java.lang.String mimeType;
	@org.kie.api.definition.type.Label("nombreArchivo")
	private java.lang.String nombreArchivo;
	@org.kie.api.definition.type.Label("archivo")
	private java.lang.String archivo;

	public ArchivoAdjuntoDTO() {
	}

	public java.lang.String getMimeType() {
		return this.mimeType;
	}

	public void setMimeType(java.lang.String mimeType) {
		this.mimeType = mimeType;
	}

	public java.lang.String getNombreArchivo() {
		return this.nombreArchivo;
	}

	public void setNombreArchivo(java.lang.String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public java.lang.String getArchivo() {
		return this.archivo;
	}

	public void setArchivo(java.lang.String archivo) {
		this.archivo = archivo;
	}

	public ArchivoAdjuntoDTO(java.lang.String mimeType,
			java.lang.String nombreArchivo, java.lang.String archivo) {
		this.mimeType = mimeType;
		this.nombreArchivo = nombreArchivo;
		this.archivo = archivo;
	}

}