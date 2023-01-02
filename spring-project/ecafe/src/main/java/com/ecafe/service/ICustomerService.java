package com.ecafe.service;
import java.util.*;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.Offer;
import com.ecafe.entity.OrderItem;
import com.ecafe.exception.CancelOrderInvalidException;
import com.ecafe.exception.PlaceOrderInvalidException;
public interface ICustomerService {
	
	public List<CafeItem> viewItems();
	public List<CafeCombo> viewCombos();
	public List<Offer> viewOffers();
	public OrderItem placeOrder(OrderItem orderItem) throws PlaceOrderInvalidException;
	public String cancelOrder(Long orderId) throws CancelOrderInvalidException;
}
