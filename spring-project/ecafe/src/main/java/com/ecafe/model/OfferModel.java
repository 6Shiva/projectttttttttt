package com.ecafe.model;

import java.sql.Date;

import com.ecafe.enumeration.OfferType;

public class OfferModel {
	private int offerId;
	private String offerCode;
	private OfferType offerType;
	private long detail;
	private boolean enabled;
	private Date validTill;
	private int offerValue;
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
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
