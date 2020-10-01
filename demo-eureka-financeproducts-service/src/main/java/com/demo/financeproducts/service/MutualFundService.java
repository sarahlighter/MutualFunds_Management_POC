package com.demo.financeproducts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.financeproducts.model.MutualFund;
import com.demo.financeproducts.repository.MutualFundRepository;

@Service
public class MutualFundService {

	@Autowired
	private MutualFundRepository mutualfundRepository;
	
	public List<MutualFund> findAll(){
		return (List<MutualFund>) mutualfundRepository.findAll();
	}
	
	public void save(MutualFund mutualfund) {
		mutualfundRepository.save(mutualfund);
	}
	
}
