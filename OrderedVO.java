package com.javaclass.vo;

public class OrderedVO {
	private Integer ono;
	private Integer orderAmount;
	private String orderState;
	private String orderDate;
	private String payDate;
	private String recipientName;
	private String recipientTel;
	private String note;
	private String orderedOption;
	private String orderedName;
	private Integer orderedPrice;
	private Integer mno;
	private Integer gno;
	
	
	@Override
	public String toString() {
		return "OrderedVO [ono=" + ono + ", orderAmount=" + orderAmount + ", orderState=" + orderState + ", orderDate="
				+ orderDate + ", payDate=" + payDate + ", recipientName=" + recipientName + ", recipientTel="
				+ recipientTel + ", note=" + note + ", orderedOption=" + orderedOption + ", orderedName=" + orderedName
				+ ", orderedPrice=" + orderedPrice + ", mno=" + mno + ", gno=" + gno + "]";
	}


	public Integer getOno() {
		return ono;
	}


	public void setOno(Integer ono) {
		this.ono = ono;
	}


	public Integer getOrderAmount() {
		return orderAmount;
	}


	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}


	public String getOrderState() {
		return orderState;
	}


	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public String getPayDate() {
		return payDate;
	}


	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}


	public String getRecipientName() {
		return recipientName;
	}


	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}


	public String getRecipientTel() {
		return recipientTel;
	}


	public void setRecipientTel(String recipientTel) {
		this.recipientTel = recipientTel;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public String getOrderedOption() {
		return orderedOption;
	}


	public void setOrderedOption(String orderedOption) {
		this.orderedOption = orderedOption;
	}


	public String getOrderedName() {
		return orderedName;
	}


	public void setOrderedName(String orderedName) {
		this.orderedName = orderedName;
	}


	public Integer getOrderedPrice() {
		return orderedPrice;
	}


	public void setOrderedPrice(Integer orderedPrice) {
		this.orderedPrice = orderedPrice;
	}


	public Integer getMno() {
		return mno;
	}


	public void setMno(Integer mno) {
		this.mno = mno;
	}


	public Integer getGno() {
		return gno;
	}


	public void setGno(Integer gno) {
		this.gno = gno;
	}
	
	
	
	
	
	

}
