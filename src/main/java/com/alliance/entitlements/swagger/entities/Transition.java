/**
 * 
 */
package com.alliance.entitlements.swagger.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author hongyi.a.song
 *
 */
@Entity
public class Transition extends Base implements Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 7413039387956492767L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transitionKey;

	@OneToOne
	@NotNull
	private Status currentStatus;

	@OneToOne
	@NotNull
	private Status nextStatus;
	@NotBlank
	private String description;

	public int getTransitionKey() {
		return transitionKey;
	}

	// public void setTransitionKey(int transitionKey) {
	// this.transitionKey = transitionKey;
	// }

	public Status getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(Status currentStatus) {
		this.currentStatus = currentStatus;
	}

	public Status getNextStatus() {
		return nextStatus;
	}

	public void setNextStatus(Status nextStatus) {
		this.nextStatus = nextStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
