/**
 * 
 */
package com.alliance.entitlements.swagger.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author hongyi.a.song
 *
 *         The aggregation entity for the StatusModel
 */
@Entity
public class StatusModel extends Base implements Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 3755958755774041193L;

	@Id
	@NotBlank
	@Column(columnDefinition = "varchar(100) default ''")
	private String statusModelCode;
	
	@NotBlank
	@Column(columnDefinition = "varchar(100) default ''")
	private String text;

	private String description;

	@OneToOne(targetEntity = Status.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "status_code")
	@NotNull
	private Status initialStatus;

	@OneToMany(targetEntity = Transition.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "status_model_code")
	private List<Transition> transitionList;
	
	public String getStatusModelCode() {
		return statusModelCode;
	}

	public void setStatusModelCode(String statusModelCode) {
		this.statusModelCode = statusModelCode;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getInitialStatus() {
		return initialStatus;
	}

	public void setInitialStatus(Status initialStatus) {
		this.initialStatus = initialStatus;
	}

	// public List<Transition> getTransitionList() {
	// return transitionList;
	// }
	//
	// public void setTransitionList(List<Transition> transitionList) {
	// this.transitionList = transitionList;
	// }
}
