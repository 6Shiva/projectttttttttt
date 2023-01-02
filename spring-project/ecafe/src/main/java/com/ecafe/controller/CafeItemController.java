package com.ecafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecafe.entity.CafeItem;
import com.ecafe.service.ICustomerService;
import com.ecafe.service.IManagerService;

@RestController
@RequestMapping("/cafeitem")
public class CafeItemController {
	@Autowired
	private IManagerService service;
	@Autowired
	private ICustomerService custservice;
	
	@PostMapping("/add")
	public CafeItem addCafeItem(@RequestBody CafeItem cafeitem)
	{
		CafeItem additem = this.service.addItem(cafeitem);
		return cafeitem;
		
	}
	@GetMapping("/items")
	public List<CafeItem> viewItems(){
		List<CafeItem> item = custservice.viewItems();
		
		return item;
		
	}
	

}
