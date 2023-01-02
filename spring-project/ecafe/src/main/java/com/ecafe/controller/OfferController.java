package com.ecafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.Offer;
import com.ecafe.service.ICustomerService;

@RestController
@RequestMapping("/cafecombo")
public class OfferController {
	@Autowired
	private ICustomerService custservice;
	@GetMapping("/alloffers")
	public List<Offer> viewOffers(){
		List<Offer> offer = custservice.viewOffers();
		return offer;
		
	}
	

}
