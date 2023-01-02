package com.ecafe.model;

import com.ecafe.enumeration.PaymentStatus;
import com.ecafe.enumeration.PaymentType;

public class PaymentModel {
	private long paymentId;
	private long customerId;
	private long orderId;
	private PaymentStatus status;
	private double amount;
	private PaymentType paidBy;
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public PaymentType getPaidBy() {
		return paidBy;
	}
	public void setPaidBy(PaymentType paidBy) {
		this.paidBy = paidBy;
	}

}
