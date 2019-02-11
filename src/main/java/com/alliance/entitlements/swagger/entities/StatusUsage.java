/**
 * 
 */
package com.alliance.entitlements.swagger.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author hongyi.a.song
 *
 *         StatusUsage class represents the specific status of a StatusModel
 */
@Entity
public class StatusUsage implements Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = -6760933096791062668L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne
	private Status status;

	@OneToOne
	private StatusModel statusModel;
	
	@Column(columnDefinition="timestamp")
	private LocalDateTime createdAt;

	public int getId() {
		return id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public StatusModel getStatusModel() {
		return statusModel;
	}

	public void setStatusModel(StatusModel statusModel) {
		this.statusModel = statusModel;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}
