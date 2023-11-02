package com.javassem.vo;

public class DeliveryVO {

	private Integer dno;
	private String  trackingNum;
	private String  trackingNumDate;
	private String  supplier;
	private String  deliveryState;
	private String  deliveryStartDate;
	private String  deliveryEndDate;
	private Integer pno;
	private Integer rno;
	
	public Integer getDno() {
		return dno;
	}
	public void setDno(Integer dno) {
		this.dno = dno;
	}
	public String getTrackingNum() {
		return trackingNum;
	}
	public void setTrackingNum(String trackingNum) {
		this.trackingNum = trackingNum;
	}
	public String getTrackingNumDate() {
		return trackingNumDate;
	}
	public void setTrackingNumDate(String trackingNumDate) {
		this.trackingNumDate = trackingNumDate;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getDeliveryState() {
		return deliveryState;
	}
	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}
	public String getDeliveryStartDate() {
		return deliveryStartDate;
	}
	public void setDeliveryStartDate(String deliveryStartDate) {
		this.deliveryStartDate = deliveryStartDate;
	}
	public String getDeliveryEndDate() {
		return deliveryEndDate;
	}
	public void setDeliveryEndDate(String deliveryEndDate) {
		this.deliveryEndDate = deliveryEndDate;
	}
	public Integer getPno() {
		return pno;
	}
	public void setPno(Integer pno) {
		this.pno = pno;
	}
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	
	@Override
	public String toString() {
		return "DeliveryVO [dno=" + dno + ", trackingNum=" + trackingNum + ", trackingNumDate=" + trackingNumDate
				+ ", supplier=" + supplier + ", deliveryState=" + deliveryState + ", deliveryStartDate="
				+ deliveryStartDate + ", deliveryEndDate=" + deliveryEndDate + ", pno=" + pno + ", rno=" + rno + "]";
	}
	
}
