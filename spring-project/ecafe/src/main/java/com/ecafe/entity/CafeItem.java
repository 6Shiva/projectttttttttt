package com.ecafe.entity;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecafe.enumeration.ItemType;

@Entity
public class CafeItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String name;
	private String detail;
	private String imageUrl;
	private ItemType type;
	private double amount;
	public CafeItem(int itemId, String name, String detail, String imageUrl, ItemType type, double amount) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.detail = detail;
		this.imageUrl = imageUrl;
		this.type = type;
		this.amount = amount;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "CafeItem [itemId=" + itemId + ", name=" + name + ", detail=" + detail + ", imageUrl=" + imageUrl
				+ ", type=" + type + ", amount=" + amount + "]";
	}
	public CafeItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CafeItem(String name, String detail, String imageUrl, ItemType type, double amount) {
		super();
		this.name = name;
		this.detail = detail;
		this.imageUrl = imageUrl;
		this.type = type;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public ItemType getType() {
		return type;
	}
	public void setType(ItemType type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}

