/**
 * 
 */
package com.alliance.entitlements.swagger.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author hongyi.a.song
 *
 *         The aggregation entity for the StatusModel
 */
@Entity
public class StatusModelUsage extends Base implements Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 3755958755774041193L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String type;

	private int usageCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUsageCode() {
		return usageCode;
	}

	public void setUsageCode(int usageCode) {
		this.usageCode = usageCode;
	}

}
