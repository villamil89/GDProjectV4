package com.sdis.gdproject.model.dto;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ProcessRequestDTO")
public class ProcessRequestDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("containerId")
	private java.lang.String containerId;
	@org.kie.api.definition.type.Label("processesId")
	private java.lang.String processesId;
	@org.kie.api.definition.type.Label("processInstance")
	private java.lang.String processInstance;
	@org.kie.api.definition.type.Label("taskId")
	private java.lang.String taskId;
	@org.kie.api.definition.type.Label("taskStatus")
	private java.lang.String taskStatus;
	@org.kie.api.definition.type.Label("groups")
	private java.util.List<java.lang.String> groups;
	@org.kie.api.definition.type.Label("ownerUser")
	private com.sdis.gdproject.model.dto.UserDTO ownerUser;
	@org.kie.api.definition.type.Label("assignment")
	private com.sdis.gdproject.model.dto.UserDTO assignment;
	@org.kie.api.definition.type.Label("parametros")
	private ParametrosDTO parametros;
	@org.kie.api.definition.type.Label("signal")
	private java.lang.String signal;

	public ProcessRequestDTO() {
	}

	public java.lang.String getContainerId() {
		return this.containerId;
	}

	public void setContainerId(java.lang.String containerId) {
		this.containerId = containerId;
	}

	public java.lang.String getProcessesId() {
		return this.processesId;
	}

	public void setProcessesId(java.lang.String processesId) {
		this.processesId = processesId;
	}

	public java.lang.String getProcessInstance() {
		return this.processInstance;
	}

	public void setProcessInstance(java.lang.String processInstance) {
		this.processInstance = processInstance;
	}

	public java.lang.String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(java.lang.String taskId) {
		this.taskId = taskId;
	}

	public java.lang.String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(java.lang.String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public java.util.List<java.lang.String> getGroups() {
		return this.groups;
	}

	public void setGroups(java.util.List<java.lang.String> groups) {
		this.groups = groups;
	}

	public com.sdis.gdproject.model.dto.UserDTO getOwnerUser() {
		return this.ownerUser;
	}

	public void setOwnerUser(com.sdis.gdproject.model.dto.UserDTO ownerUser) {
		this.ownerUser = ownerUser;
	}

	public com.sdis.gdproject.model.dto.UserDTO getAssignment() {
		return this.assignment;
	}

	public void setAssignment(com.sdis.gdproject.model.dto.UserDTO assignment) {
		this.assignment = assignment;
	}

	public java.lang.String getSignal() {
		return this.signal;
	}

	public void setSignal(java.lang.String signal) {
		this.signal = signal;
	}

	public com.sdis.gdproject.model.dto.ParametrosDTO getParametros() {
		return this.parametros;
	}

	public void setParametros(com.sdis.gdproject.model.dto.ParametrosDTO parametros) {
		this.parametros = parametros;
	}

	public ProcessRequestDTO(java.lang.String containerId,
			java.lang.String processesId, java.lang.String processInstance,
			java.lang.String taskId, java.lang.String taskStatus,
			java.util.List<java.lang.String> groups,
			com.sdis.gdproject.model.dto.UserDTO ownerUser,
			com.sdis.gdproject.model.dto.UserDTO assignment,
			com.sdis.gdproject.model.dto.ParametrosDTO parametros,
			java.lang.String signal) {
		this.containerId = containerId;
		this.processesId = processesId;
		this.processInstance = processInstance;
		this.taskId = taskId;
		this.taskStatus = taskStatus;
		this.groups = groups;
		this.ownerUser = ownerUser;
		this.assignment = assignment;
		this.parametros = parametros;
		this.signal = signal;
	}

}