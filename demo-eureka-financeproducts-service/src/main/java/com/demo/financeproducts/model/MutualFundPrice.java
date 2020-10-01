package com.demo.financeproducts.model;

import java.util.Date;

public class MutualFundPrice {

	private long id;
	private String name;
	private double netAssetValue; // fund price
	private double publicOfferingPrice;
	private Date timestamp;

	public MutualFundPrice() {
	}

	public MutualFundPrice(long id, String name, double netAssetValue, double publicOfferingPrice, Date timestamp) {
		super();
		this.id = id;
		this.name = name;
		this.netAssetValue = netAssetValue;
		this.publicOfferingPrice = publicOfferingPrice;
		this.timestamp = timestamp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetAssetValue() {
		return netAssetValue;
	}

	public void setNetAssetValue(double netAssetValue) {
		this.netAssetValue = netAssetValue;
	}

	public double getPublicOfferingPrice() {
		return publicOfferingPrice;
	}

	public void setPublicOfferingPrice(double publicOfferingPrice) {
		this.publicOfferingPrice = publicOfferingPrice;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "MutualFundPrice [id=" + id + ", name=" + name + ", netAssetValue=" + netAssetValue
				+ ", publicOfferingPrice=" + publicOfferingPrice + ", timestamp=" + timestamp + "]";
	}

}
