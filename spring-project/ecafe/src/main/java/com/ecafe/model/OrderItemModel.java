package com.ecafe.model;

public class OrderItemModel {
	private long orderId;
	private long itemId;
	private  boolean isCombo;
	private int quantity;
	private double amount;
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
