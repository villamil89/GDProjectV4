package com.sdis.gdproject.model.dto;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ValueDto")
public class ValueDto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "key")
	private java.lang.String key;
	@org.kie.api.definition.type.Label(value = "value")
	private java.lang.String value;

	public ValueDto() {
	}

	public java.lang.String getKey() {
		return this.key;
	}

	public void setKey(java.lang.String key) {
		this.key = key;
	}

	public java.lang.String getValue() {
		return this.value;
	}

	public void setValue(java.lang.String value) {
		this.value = value;
	}

	public ValueDto(java.lang.String key, java.lang.String value) {
		this.key = key;
		this.value = value;
	}

}