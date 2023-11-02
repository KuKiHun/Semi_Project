package com.javaclass.vo;

public class ClaimVO {
	
	private Integer cno;
	private String  claimType;
	private Integer claimPrice;
	private String  claimRequestDate;
	private String  claimReceiptDate;
	private String  claimCompleteDate;
	private String  claimState;
	private String  claimTrackingNum;
	private Integer pno;
	private Integer dno;
	private Integer ono;
	
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	public Integer getClaimPrice() {
		return claimPrice;
	}
	public void setClaimPrice(Integer claimPrice) {
		this.claimPrice = claimPrice;
	}
	public String getClaimRequestDate() {
		return claimRequestDate;
	}
	public void setClaimRequestDate(String claimRequestDate) {
		this.claimRequestDate = claimRequestDate;
	}
	public String getClaimReceiptDate() {
		return claimReceiptDate;
	}
	public void setClaimReceiptDate(String claimReceiptDate) {
		this.claimReceiptDate = claimReceiptDate;
	}
	public String getClaimCompleteDate() {
		return claimCompleteDate;
	}
	public void setClaimCompleteDate(String claimCompleteDate) {
		this.claimCompleteDate = claimCompleteDate;
	}
	public String getClaimState() {
		return claimState;
	}
	public void setClaimState(String claimState) {
		this.claimState = claimState;
	}
	public String getClaimTrackingNum() {
		return claimTrackingNum;
	}
	public void setClaimTrackingNum(String claimTrackingNum) {
		this.claimTrackingNum = claimTrackingNum;
	}
	public Integer getPno() {
		return pno;
	}
	public void setPno(Integer pno) {
		this.pno = pno;
	}
	public Integer getDno() {
		return dno;
	}
	public void setDno(Integer dno) {
		this.dno = dno;
	}
	public Integer getOno() {
		return ono;
	}
	public void setOno(Integer ono) {
		this.ono = ono;
	}
	
	@Override
	public String toString() {
		return "ClaimVO [cno=" + cno + ", claimType=" + claimType + ", claimPrice=" + claimPrice + ", claimRequestDate="
				+ claimRequestDate + ", claimReceiptDate=" + claimReceiptDate + ", claimCompleteDate="
				+ claimCompleteDate + ", claimState=" + claimState + ", claimTrackingNum=" + claimTrackingNum + ", pno="
				+ pno + ", dno=" + dno + ", ono=" + ono + "]";
	}
	
	
}
