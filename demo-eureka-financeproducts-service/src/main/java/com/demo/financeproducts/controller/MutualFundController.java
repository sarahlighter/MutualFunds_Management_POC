package com.demo.financeproducts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.financeproducts.model.MutualFund;
import com.demo.financeproducts.repository.MutualFundRepository;
import com.demo.financeproducts.service.MutualFundService;

//@RibbonClient(name="demo-mutualfund-service")
@Controller
@RestController
@CrossOrigin()
public class MutualFundController {

	@Autowired
	private MutualFundService mutualfundService;
	
	@RequestMapping(value = "/mutualfunds/profile", method= RequestMethod.POST)
	public MutualFund insertMutualFund(@RequestBody MutualFund mutualfund) {
		return mutualfundService.save(mutualfund);
	}
	
	@RequestMapping(value = "/mutualfunds/profile",params= {"id"}, method= RequestMethod.PUT)
	public MutualFund updateMutualFund(@RequestBody MutualFund mutualfund) {
		mutualfundService.save(mutualfund);
		return mutualfund;
	}
	
	@RequestMapping(value = "/mutualfunds/profile",params= {"id"}, method= RequestMethod.DELETE)
	public Optional<MutualFund> deleteMutualFund(@RequestParam long id) {
		return mutualfundService.deleteById(id);
	}
	
	
	@RequestMapping(value = "/mutualfunds", method = RequestMethod.GET)
	public List<MutualFund> viewAll() {
		return mutualfundService.findAll();
	}
	
	@RequestMapping(value = "/mutualfunds/profile", params= {"id"},method = RequestMethod.GET)
	public Optional<MutualFund> getMutualFundProfileById(@RequestParam long id) {
		
		return mutualfundService.findById(id);
	}
	//example /mutualfunds/profile?ticker=TIBEX
	@RequestMapping(value = "/mutualfunds/profile", params= {"ticker"},method = RequestMethod.GET)
	public MutualFund getMutualFundProfileByTicker(@RequestParam String ticker) {
		
		return mutualfundService.findByTicker(ticker);
	}
}
