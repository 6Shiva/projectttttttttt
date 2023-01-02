package com.ecafe.model;
import java.util.List;

import com.ecafe.entity.OrderItem;


public class CustomerOrderModel {
	private long orderId;
	private List<OrderItem> order;
	private boolean isOfferApplied;
	private String offerCode;
	private double tax;
	private double totalAmount;
	private double finalAmount;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public List<OrderItem> getOrder() {
		return order;
	}
	public void setOrder(List<OrderItem> order) {
		this.order = order;
	}
	public boolean isOfferApplied() {
		return isOfferApplied;
	}
	public void setOfferApplied(boolean isOfferApplied) {
		this.isOfferApplied = isOfferApplied;
	}
	public String getOfferCode() {
		return offerCode;
	}
	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
}
