package com.javaclass.vo;

public class PromotionVO {
	
	private Integer promno;
	private String promotionType;
	private String promotionName;
	private Integer condition;
	private Integer discountPct;
	private String proStartdate;
	private String proEnddate;
	
	
	@Override
	public String toString() {
		return "PromotionVO [promno=" + promno + ", promotionType=" + promotionType + ", promotionName=" + promotionName
				+ ", condition=" + condition + ", discountPct=" + discountPct + ", proStartdate=" + proStartdate
				+ ", proEnddate=" + proEnddate + "]";
	}


	public Integer getPromno() {
		return promno;
	}


	public void setPromno(Integer promno) {
		this.promno = promno;
	}


	public String getPromotionType() {
		return promotionType;
	}


	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}


	public String getPromotionName() {
		return promotionName;
	}


	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}


	public Integer getCondition() {
		return condition;
	}


	public void setCondition(Integer condition) {
		this.condition = condition;
	}


	public Integer getDiscountPct() {
		return discountPct;
	}


	public void setDiscountPct(Integer discountPct) {
		this.discountPct = discountPct;
	}


	public String getProStartdate() {
		return proStartdate;
	}


	public void setProStartdate(String proStartdate) {
		this.proStartdate = proStartdate;
	}


	public String getProEnddate() {
		return proEnddate;
	}


	public void setProEnddate(String proEnddate) {
		this.proEnddate = proEnddate;
	}

}
