package com.sdis.gdproject.model.dto;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AssignmentRequestDto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String instanceId;
	private java.lang.String activityName;
	private java.lang.String actualOwner;
	private java.lang.String originalTime;

	public AssignmentRequestDto() {
	}

	public java.lang.String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(java.lang.String instanceId) {
		this.instanceId = instanceId;
	}

	public java.lang.String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(java.lang.String activityName) {
		this.activityName = activityName;
	}

	public java.lang.String getActualOwner() {
		return this.actualOwner;
	}

	public void setActualOwner(java.lang.String actualOwner) {
		this.actualOwner = actualOwner;
	}

	public java.lang.String getOriginalTime() {
		return this.originalTime;
	}

	public void setOriginalTime(java.lang.String originalTime) {
		this.originalTime = originalTime;
	}

	public AssignmentRequestDto(
	    java.lang.String instanceId,
		java.lang.String activityName, 
		java.lang.String actualOwner,
		java.lang.String originalTime) {
		this.instanceId = instanceId;
		this.activityName = activityName;
		this.actualOwner = actualOwner;
		this.originalTime = originalTime;
	}

}