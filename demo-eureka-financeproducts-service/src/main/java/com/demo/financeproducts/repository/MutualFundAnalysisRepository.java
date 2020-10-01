package com.demo.financeproducts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.financeproducts.model.MutualFundAnalysis;

@Repository
public interface MutualFundAnalysisRepository extends JpaRepository<MutualFundAnalysis, Long>{

}
