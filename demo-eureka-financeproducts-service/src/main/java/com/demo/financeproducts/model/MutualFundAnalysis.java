package com.demo.financeproducts.model;

import java.util.HashSet;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="mutualfunds_analysis")
public class MutualFundAnalysis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long investmentRiskReportId;
	private long morningstarReportId;
	private String performanceReturnsId;
	private String ManagementTeamId;
	private HashSet<String> holdingsId;

	@JsonBackReference	//prevent infinite loop
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "mutualfund_id", nullable = false)
	private MutualFund mutualfund;
	 
	public MutualFundAnalysis() {
		
	}
	
	public MutualFundAnalysis(long id, long investmentRiskReportId, long morningstarReportId,
			String performanceReturnsId, String managementTeamId, HashSet<String> holdingsId, MutualFund mutualfund) {
		super();
		this.id = id;
		this.investmentRiskReportId = investmentRiskReportId;
		this.morningstarReportId = morningstarReportId;
		this.performanceReturnsId = performanceReturnsId;
		ManagementTeamId = managementTeamId;
		this.holdingsId = holdingsId;
		this.mutualfund = mutualfund;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getInvestmentRiskReportId() {
		return investmentRiskReportId;
	}

	public void setInvestmentRiskReportId(long investmentRiskReportId) {
		this.investmentRiskReportId = investmentRiskReportId;
	}

	public long getMorningstarReportId() {
		return morningstarReportId;
	}

	public void setMorningstarReportId(long morningstarReportId) {
		this.morningstarReportId = morningstarReportId;
	}

	public String getPerformanceReturnsId() {
		return performanceReturnsId;
	}

	public void setPerformanceReturnsId(String performanceReturnsId) {
		this.performanceReturnsId = performanceReturnsId;
	}

	public String getManagementTeamId() {
		return ManagementTeamId;
	}

	public void setManagementTeamId(String managementTeamId) {
		ManagementTeamId = managementTeamId;
	}




	public HashSet<String> getHoldingsId() {
		return holdingsId;
	}




	public void setHoldingsId(HashSet<String> holdingsId) {
		this.holdingsId = holdingsId;
	}




	public MutualFund getMutualfund() {
		return mutualfund;
	}




	public void setMutualfund(MutualFund mutualfund) {
		this.mutualfund = mutualfund;
	}




	@Override
	public String toString() {
		return "MutualFundAnalysis [id=" + id + ", investmentRiskReportId=" + investmentRiskReportId
				+ ", morningstarReportId=" + morningstarReportId + ", performanceReturnsId=" + performanceReturnsId
				+ ", ManagementTeamId=" + ManagementTeamId + ", holdingsId=" + holdingsId + ", mutualfund=" + mutualfund
				+ "]";
	}


}
