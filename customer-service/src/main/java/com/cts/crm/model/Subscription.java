package com.cts.crm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subscription")
public class Subscription implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subscriptionId;
	private String planName;
	private String expiryDate;
	private boolean planStatus;
	@ManyToOne
	@JoinColumn(name="customerId")
	private CustomerService customerId;
	public int getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public boolean isPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(boolean planStatus) {
		this.planStatus = planStatus;
	}
	public CustomerService getCustomerId() {
		return customerId;
	}
	public void setCustomerId(CustomerService customerId) {
		this.customerId = customerId;
	}
	public Subscription(int subscriptionId, String planName, String expiryDate, boolean planStatus,
			CustomerService customerId) {
		super();
		this.subscriptionId = subscriptionId;
		this.planName = planName;
		this.expiryDate = expiryDate;
		this.planStatus = planStatus;
		this.customerId = customerId;
	}
	public Subscription() {
		super();
	}
	
	
	

}
