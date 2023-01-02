package com.ecafe.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	private long itemId;
	private  boolean isCombo;
	private int quantity;
	private double amount;
	public OrderItem(long orderId, long itemId, boolean isCombo, int quantity, double amount,
			CustomerOrder customerOrder) {
		super();
		this.orderId = orderId;
		this.itemId = itemId;
		this.isCombo = isCombo;
		this.quantity = quantity;
		this.amount = amount;
		this.customerOrder = customerOrder;
	}
	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}
	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}
	@ManyToOne
	private CustomerOrder customerOrder;
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItem(long orderId, long itemId, boolean isCombo, int quantity, double amount) {
		super();
		this.orderId = orderId;
		this.itemId = itemId;
		this.isCombo = isCombo;
		this.quantity = quantity;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "OrderItem [orderId=" + orderId + ", itemId=" + itemId + ", isCombo=" + isCombo + ", quantity="
				+ quantity + ", amount=" + amount + ", customerOrder=" + customerOrder + "]";
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public boolean isCombo() {
		return isCombo;
	}
	public void setCombo(boolean isCombo) {
		this.isCombo = isCombo;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
