package com.demo.financeproducts.service;

import java.util.List;
import java.util.Optional;

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
	
	public MutualFund save(MutualFund mutualfund) {
		return mutualfundRepository.save(mutualfund);
	}
	
	public MutualFund findByTicker(String ticker) {
		return mutualfundRepository.findByTicker(ticker);
	}

	public Optional<MutualFund> findById(long id) {
		return mutualfundRepository.findById(id);
	}
	
	public MutualFund update(MutualFund mutualfund) {
		return mutualfundRepository.save(mutualfund);
	}
	
	public Optional<MutualFund> deleteById(long id) {
		Optional<MutualFund> mf= mutualfundRepository.findById(id);
		mutualfundRepository.deleteById(id);
		return mf;
	}
	
}
