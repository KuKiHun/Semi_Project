package com.javassem.vo;

public class GoodsVO {

	private Integer gno;
	private String  goodsCode;
	private String  goodsName;
	private String  goodsOption;
	private String  brandName;
	private Integer goodsStock;
	private Integer costPrice;
	private Integer taxPct;
	private Integer marginPct;
	private Integer marginPrice;
	private Integer sellingPrice;
	private String  saleState;
	private String  goodsDescription;
	private String  tags;
	private String  goodsImgName;
	private String  goodsImgAddr;
	private String  goodsImgSize;
	private Integer cno;
	private Integer promno;
	
	public Integer getGno() {
		return gno;
	}
	public void setGno(Integer gno) {
		this.gno = gno;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsOption() {
		return goodsOption;
	}
	public void setGoodsOption(String goodsOption) {
		this.goodsOption = goodsOption;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Integer getGoodsStock() {
		return goodsStock;
	}
	public void setGoodsStock(Integer goodsStock) {
		this.goodsStock = goodsStock;
	}
	public Integer getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Integer costPrice) {
		this.costPrice = costPrice;
	}
	public Integer getTaxPct() {
		return taxPct;
	}
	public void setTaxPct(Integer taxPct) {
		this.taxPct = taxPct;
	}
	public Integer getMarginPct() {
		return marginPct;
	}
	public void setMarginPct(Integer marginPct) {
		this.marginPct = marginPct;
	}
	public Integer getMarginPrice() {
		return marginPrice;
	}
	public void setMarginPrice(Integer marginPrice) {
		this.marginPrice = marginPrice;
	}
	public Integer getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getSaleState() {
		return saleState;
	}
	public void setSaleState(String saleState) {
		this.saleState = saleState;
	}
	public String getGoodsDescription() {
		return goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getGoodsImgName() {
		return goodsImgName;
	}
	public void setGoodsImgName(String goodsImgName) {
		this.goodsImgName = goodsImgName;
	}
	public String getGoodsImgAddr() {
		return goodsImgAddr;
	}
	public void setGoodsImgAddr(String goodsImgAddr) {
		this.goodsImgAddr = goodsImgAddr;
	}
	public String getGoodsImgSize() {
		return goodsImgSize;
	}
	public void setGoodsImgSize(String goodsImgSize) {
		this.goodsImgSize = goodsImgSize;
	}
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public Integer getPromno() {
		return promno;
	}
	public void setPromno(Integer promno) {
		this.promno = promno;
	}
	
	@Override
	public String toString() {
		return "GoodsVO [gno=" + gno + ", goodsCode=" + goodsCode + ", goodsName=" + goodsName + ", goodsOption="
				+ goodsOption + ", brandName=" + brandName + ", goodsStock=" + goodsStock + ", costPrice=" + costPrice
				+ ", taxPct=" + taxPct + ", marginPct=" + marginPct + ", marginPrice=" + marginPrice + ", sellingPrice="
				+ sellingPrice + ", saleState=" + saleState + ", goodsDescription=" + goodsDescription + ", tags="
				+ tags + ", goodsImgName=" + goodsImgName + ", goodsImgAddr=" + goodsImgAddr + ", goodsImgSize="
				+ goodsImgSize + ", cno=" + cno + ", promno=" + promno + "]";
	}
	
	
}
