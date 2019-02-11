package com.alliance.entitlements.swagger.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entitlement_tb")
public class Entitlement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long entitlementDocumentNumber;

	private String entitlemenType;
	private String entitlementDescription;
	private long quantity;
	private String uom;
	private LocalDateTime validFrom;
	private LocalDateTime validTo;
	private String status;
	private String customerId;
	private String customerName;
	private String distributorId;
	private String distributorName;
	private String contactPersonName;
	private String contactPersonEmail;
	private String contactPersonTel;
	private String sourceSystem;
	private String referenceDocType;
	private long refDocNo;
	private long refItemNo;
	private String generationMethod;
	private long simulationEntitlementNo;
	private String createdBy;
	private LocalDateTime createdOn;
	private String changedBy;
	private LocalDateTime changedOn;
	private LocalDateTime simulationValidFrom;
	private LocalDateTime simulationvalidTo;

	public long getEntitlementDocumentNumber() {
		return entitlementDocumentNumber;
	}

	public void setEntitlementDocumentNumber(long entitlementDocumentNumber) {
		this.entitlementDocumentNumber = entitlementDocumentNumber;
	}

	public String getEntitlemenType() {
		return entitlemenType;
	}

	public void setEntitlemenType(String entitlemenType) {
		this.entitlemenType = entitlemenType;
	}

	public String getEntitlementDescription() {
		return entitlementDescription;
	}

	public void setEntitlementDescription(String entitlementDescription) {
		this.entitlementDescription = entitlementDescription;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public LocalDateTime getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDateTime validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDateTime getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDateTime validTo) {
		this.validTo = validTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPersonEmail() {
		return contactPersonEmail;
	}

	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}

	public String getContactPersonTel() {
		return contactPersonTel;
	}

	public void setContactPersonTel(String contactPersonTel) {
		this.contactPersonTel = contactPersonTel;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getReferenceDocType() {
		return referenceDocType;
	}

	public void setReferenceDocType(String referenceDocType) {
		this.referenceDocType = referenceDocType;
	}

	public long getRefDocNo() {
		return refDocNo;
	}

	public void setRefDocNo(long refDocNo) {
		this.refDocNo = refDocNo;
	}

	public long getRefItemNo() {
		return refItemNo;
	}

	public void setRefItemNo(long refItemNo) {
		this.refItemNo = refItemNo;
	}

	public String getGenerationMethod() {
		return generationMethod;
	}

	public void setGenerationMethod(String generationMethod) {
		this.generationMethod = generationMethod;
	}

	public long getSimulationEntitlementNo() {
		return simulationEntitlementNo;
	}

	public void setSimulationEntitlementNo(long simulationEntitlementNo) {
		this.simulationEntitlementNo = simulationEntitlementNo;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public LocalDateTime getChangedOn() {
		return changedOn;
	}

	public void setChangedOn(LocalDateTime changedOn) {
		this.changedOn = changedOn;
	}

	public LocalDateTime getSimulationValidFrom() {
		return simulationValidFrom;
	}

	public void setSimulationValidFrom(LocalDateTime simulationValidFrom) {
		this.simulationValidFrom = simulationValidFrom;
	}

	public LocalDateTime getSimulationvalidTo() {
		return simulationvalidTo;
	}

	public void setSimulationvalidTo(LocalDateTime simulationvalidTo) {
		this.simulationvalidTo = simulationvalidTo;
	}

	@Override
	public String toString(){
		return new StringBuilder().append(entitlementDocumentNumber).toString();
		
	}
}
