package com.ecafe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecafe.enumeration.PaymentStatus;
import com.ecafe.enumeration.PaymentType;


@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long paymentId;
	private long customerId;
	private long orderId;
	private PaymentStatus status;
	private double amount;
	private PaymentType paidBy;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(long paymentId, long customerId, long orderId, PaymentStatus status, double amount,
			PaymentType paidBy) {
		super();
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.orderId = orderId;
		this.status = status;
		this.amount = amount;
		this.paidBy = paidBy;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", customerId=" + customerId + ", orderId=" + orderId + ", status="
				+ status + ", amount=" + amount + ", paidBy=" + paidBy + "]";
	}
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