package com.ecafe.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.Offer;
import com.ecafe.entity.OrderItem;
import com.ecafe.exception.CancelOrderInvalidException;
import com.ecafe.exception.PlaceOrderInvalidException;
import com.ecafe.repository.CafeComboRepository;
import com.ecafe.repository.CafeItemRepository;
import com.ecafe.repository.OfferRepository;
import com.ecafe.repository.OrderItemRepository;
import com.ecafe.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private CafeItemRepository cafeItemRepo;
	@Autowired
	private CafeComboRepository cafeComboRepo;
	@Autowired
	private OfferRepository offerRepo;
	@Autowired
	private OrderItemRepository orderItemRepo;

	@Override
	public List<CafeItem> viewItems() {
		// TODO Auto-generated method stub
		return cafeItemRepo.findAll();
		
	}

	@Override
	public List<CafeCombo> viewCombos() {
		// TODO Auto-generated method stub
		return cafeComboRepo.findAll();
	}

	@Override
	public List<Offer> viewOffers() {
		// TODO Auto-generated method stub
		return offerRepo.findAll();
	}

	@Override
	public OrderItem placeOrder(OrderItem orderItem) throws PlaceOrderInvalidException {
		// TODO Auto-generated method stub
		if(orderItem.getQuantity()<0)
		{
			throw new PlaceOrderInvalidException("invalid order item");
		}
		
		
		return orderItemRepo.save(orderItem);
	}

	@Override
	public String cancelOrder(Long orderId) throws CancelOrderInvalidException {
		// TODO Auto-generated method stub
		//Optional<OrderItem> 
		Optional<OrderItem> order = this.orderItemRepo.findById(orderId);
		if(order==null)
		{
			throw new CancelOrderInvalidException("order is not found");
		}
		return "order deleted sucessfully";
		/*Optional<OrderItem> order = this.orderItemRepo.findById(orderId);	
		try
		{
			if(order==null)
			{
				throw new Exception();
			}
			else
			{
				this.orderItemRepo.deleteById(orderId);	
			}
		}
		catch(Exception e)
		{
			return "order not found";
		}
		return "order deleted sucessfully";
	}*/

	}
	}
