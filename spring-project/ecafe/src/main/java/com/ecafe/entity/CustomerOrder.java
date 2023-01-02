package com.ecafe.entity;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.stereotype.Component;

@Entity
public class CustomerOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	@OneToMany(mappedBy="customerOrder")
	private List<OrderItem> order;
	private boolean isOfferApplied;
	private String offerCode;
	private double tax;
	private double totalAmount;
	private double finalAmount;
	public CustomerOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerOrder(long orderId, List<OrderItem> order, boolean isOfferApplied, String offerCode, double tax,
			double totalAmount, double finalAmount) {
		super();
		this.orderId = orderId;
		this.order = order;
		this.isOfferApplied = isOfferApplied;
		this.offerCode = offerCode;
		this.tax = tax;
		this.totalAmount = totalAmount;
		this.finalAmount = finalAmount;
	}
	@Override
	public String toString() {
		return "CustomerOrder [orderId=" + orderId + ", order=" + order + ", isOfferApplied=" + isOfferApplied
				+ ", offerCode=" + offerCode + ", tax=" + tax + ", totalAmount=" + totalAmount + ", finalAmount="
				+ finalAmount + "]";
	}
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
