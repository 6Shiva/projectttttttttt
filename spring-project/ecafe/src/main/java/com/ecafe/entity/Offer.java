package com.ecafe.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecafe.enumeration.OfferType;

@Entity
public class Offer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int offerId;
	private String offerCode;
	private OfferType offerType;
	private long detail;
	private boolean enabled;
	private Date validTill;
	private int offerValue;
	public Offer(int offerId, String offerCode, OfferType offerType, long detail, boolean enabled, Date validTill,
			int offerValue) {
		super();
		this.offerId = offerId;
		this.offerCode = offerCode;
		this.offerType = offerType;
		this.detail = detail;
		this.enabled = enabled;
		this.validTill = validTill;
		this.offerValue = offerValue;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Offer(String offerCode, OfferType offerType, long detail, boolean enabled, Date validTill, int offerValue) {
		super();
		this.offerCode = offerCode;
		this.offerType = offerType;
		this.detail = detail;
		this.enabled = enabled;
		this.validTill = validTill;
		this.offerValue = offerValue;
	}
	@Override
	public String toString() {
		return "Offer [offerId=" + offerId + ", offerCode=" + offerCode + ", offerType=" + offerType + ", detail="
				+ detail + ", enabled=" + enabled + ", validTill=" + validTill + ", offerValue=" + offerValue + "]";
	}
	public String getOfferCode() {
		return offerCode;
	}
	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}
	public OfferType getOfferType() {
		return offerType;
	}
	public void setOfferType(OfferType offerType) {
		this.offerType = offerType;
	}
	public long getDetail() {
		return detail;
	}
	public void setDetail(long detail) {
		this.detail = detail;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Date getValidTill() {
		return validTill;
	}
	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}
	public int getOfferValue() {
		return offerValue;
	}
	public void setOfferValue(int offerValue) {
		this.offerValue = offerValue;
	}
	

}
