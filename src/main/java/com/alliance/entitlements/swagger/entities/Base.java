package com.alliance.entitlements.swagger.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Base implements Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = -298878165180548820L;

	private String createdBy;
	@Column(columnDefinition="timestamp")
	private LocalDateTime createdAt;

	private String changedBy;
	@Column(columnDefinition="timestamp")
	private LocalDateTime changedAt;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public LocalDateTime getChangedAt() {
		return changedAt;
	}

	public void setChangedAt(LocalDateTime changedAt) {
		this.changedAt = changedAt;
	}
}