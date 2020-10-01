package com.demo.financeproducts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Controller;
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
public class MutualFundController {

	@Autowired
	private MutualFundService mutualfundService;
	
	
	@RequestMapping(value = "/mutualfunds", method= RequestMethod.POST)
	public MutualFund insertMutualFund(@RequestBody MutualFund mutualfund) {
		mutualfundService.save(mutualfund);
		return mutualfund;
	}
	@RequestMapping(value = "/mutualfunds", method = RequestMethod.GET)
	public List<MutualFund> viewAll() {
		return mutualfundService.findAll();
	}
//	//example /mutualfunds/profile?ticker=26176542
//	@RequestMapping(value = "/mutualfunds/profile", params= {"ticker"},method = RequestMethod.GET)
//	public MutualFund getMutualFundProfileByTicker(@RequestParam String ticker) {
//		
//		return mutualfundService.findByTicker(ticker);
//	}
}