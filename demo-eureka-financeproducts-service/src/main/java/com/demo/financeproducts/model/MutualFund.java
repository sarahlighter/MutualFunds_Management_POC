package com.demo.financeproducts.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="mutualfunds")
public class MutualFund {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String accountType;
	private String assetClass;
	private String ticker;
	private String shareClass;
	private String CUSIP;
	
	@JsonManagedReference // prevent infinite loop
	@OneToOne(mappedBy= "mutualfund", fetch= FetchType.LAZY,cascade=CascadeType.ALL)
	private MutualFundAnalysis analysis;	

	// Hibernate requires a no-arg constructor
	public MutualFund() {
	}

	public MutualFund(long id, @NotNull String name, String accountType, String assetClass, @NotNull String ticker,
			String shareClass, String cUSIP, MutualFundAnalysis analysis) {
		super();
		this.id = id;
		this.name = name;
		this.accountType = accountType;
		this.assetClass = assetClass;
		this.ticker = ticker;
		this.shareClass = shareClass;
		CUSIP = cUSIP;
		this.analysis = analysis;
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAssetClass() {
		return assetClass;
	}

	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getShareClass() {
		return shareClass;
	}

	public void setShareClass(String shareClass) {
		this.shareClass = shareClass;
	}

	public String getCUSIP() {
		return CUSIP;
	}

	public void setCUSIP(String cUSIP) {
		CUSIP = cUSIP;
	}

	
	public MutualFundAnalysis getAnalysis() {
		return analysis;
	}

	public void setAnalysis(MutualFundAnalysis analysis) {
		this.analysis = analysis;
	}

	@Override
	public String toString() {
		return "MutualFund [id=" + id + ", name=" + name + ", accountType=" + accountType + ", assetClass=" + assetClass
				+ ", ticker=" + ticker + ", shareClass=" + shareClass + ", CUSIP=" + CUSIP + ", analysis=" + analysis
				+ "]";
	}
	
	

}
