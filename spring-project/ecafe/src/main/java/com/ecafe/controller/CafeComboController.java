package com.ecafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.service.ICustomerService;

@RestController
@RequestMapping("/cafecombo")
public class CafeComboController {
	@Autowired
	private ICustomerService custservice;
	@GetMapping("/allcombos")
	public List<CafeCombo> viewCombos(){
		List<CafeCombo> combo = custservice.viewCombos();
		
		return combo;
		
	}
	

}
