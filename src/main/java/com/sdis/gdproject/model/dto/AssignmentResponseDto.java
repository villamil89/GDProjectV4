package com.sdis.gdproject.model.dto;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AssignmentResponseDto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String actualOwner;
	private java.lang.String timeOut;
	private java.lang.Boolean reassignment;

	public AssignmentResponseDto() {
	}

	public java.lang.String getActualOwner() {
		return this.actualOwner;
	}

	public void setActualOwner(java.lang.String actualOwner) {
		this.actualOwner = actualOwner;
	}

	public java.lang.String getTimeOut() {
		return this.timeOut;
	}

	public void setTimeOut(java.lang.String timeOut) {
		this.timeOut = timeOut;
	}

	public java.lang.Boolean getReassignment() {
		return this.reassignment;
	}

	public void setReassignment(java.lang.Boolean reassignment) {
		this.reassignment = reassignment;
	}

	public AssignmentResponseDto(java.lang.String actualOwner,
			java.lang.String timeOut, java.lang.Boolean reassignment) {
		this.actualOwner = actualOwner;
		this.timeOut = timeOut;
		this.reassignment = reassignment;
	}

}