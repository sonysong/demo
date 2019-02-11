/**
 * 
 */
package com.alliance.entitlements.swagger.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author hongyi.a.song
 *
 *         Status class represents the specific status of a StatusModel
 */
@Entity
public class Status extends Base implements Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 2366569100166045047L;

	@Id
	@NotBlank
	@Column(columnDefinition="varchar(100) default ''")
	private String statusCode;

	@NotBlank
	@Column
	private String text;

	private String description;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
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
}
