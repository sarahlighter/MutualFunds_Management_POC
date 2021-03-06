package com.demo.financeproducts.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.financeproducts.model.MutualFund;

@Repository
public interface MutualFundRepository extends CrudRepository<MutualFund,Long>{

	MutualFund findByTicker(String ticker);

}
