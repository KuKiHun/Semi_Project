package com.javaclass.vo;

public class PaymentVO {
	private Integer pno;
	private Integer payAppointed;
	private String payer;
	private Integer payPrice;
	private String payBank;
	private Integer addPrice;
	private Integer totalBuyPrice;
	private Integer totalPayPrice;
	private Integer usedMiileage;
	private Integer ono;
	
	
	@Override
	public String toString() {
		return "PaymentVO [pno=" + pno + ", payAppointed=" + payAppointed + ", payer=" + payer + ", payPrice="
				+ payPrice + ", payBank=" + payBank + ", addPrice=" + addPrice + ", totalBuyPrice=" + totalBuyPrice
				+ ", totalPayPrice=" + totalPayPrice + ", usedMiileage=" + usedMiileage + ", ono=" + ono + "]";
	}


	public Integer getPno() {
		return pno;
	}


	public void setPno(Integer pno) {
		this.pno = pno;
	}


	public Integer getPayAppointed() {
		return payAppointed;
	}


	public void setPayAppointed(Integer payAppointed) {
		this.payAppointed = payAppointed;
	}


	public String getPayer() {
		return payer;
	}


	public void setPayer(String payer) {
		this.payer = payer;
	}


	public Integer getPayPrice() {
		return payPrice;
	}


	public void setPayPrice(Integer payPrice) {
		this.payPrice = payPrice;
	}


	public String getPayBank() {
		return payBank;
	}


	public void setPayBank(String payBank) {
		this.payBank = payBank;
	}


	public Integer getAddPrice() {
		return addPrice;
	}


	public void setAddPrice(Integer addPrice) {
		this.addPrice = addPrice;
	}


	public Integer getTotalBuyPrice() {
		return totalBuyPrice;
	}


	public void setTotalBuyPrice(Integer totalBuyPrice) {
		this.totalBuyPrice = totalBuyPrice;
	}


	public Integer getTotalPayPrice() {
		return totalPayPrice;
	}


	public void setTotalPayPrice(Integer totalPayPrice) {
		this.totalPayPrice = totalPayPrice;
	}


	public Integer getUsedMiileage() {
		return usedMiileage;
	}


	public void setUsedMiileage(Integer usedMiileage) {
		this.usedMiileage = usedMiileage;
	}


	public Integer getOno() {
		return ono;
	}


	public void setOno(Integer ono) {
		this.ono = ono;
	}
	
	
}
