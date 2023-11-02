package com.javaclass.vo;

public class CategoryVO {

	private Integer cno;
	private String  majCat;
	private String  midCat;
	private String  minCat;
	private String  subCat;
	
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getMajCat() {
		return majCat;
	}
	public void setMajCat(String majCat) {
		this.majCat = majCat;
	}
	public String getMidCat() {
		return midCat;
	}
	public void setMidCat(String midCat) {
		this.midCat = midCat;
	}
	public String getMinCat() {
		return minCat;
	}
	public void setMinCat(String minCat) {
		this.minCat = minCat;
	}
	public String getSubCat() {
		return subCat;
	}
	public void setSubCat(String subCat) {
		this.subCat = subCat;
	}
	
	@Override
	public String toString() {
		return "CategoryVO [cno=" + cno + ", majCat=" + majCat + ", midCat=" + midCat + ", minCat=" + minCat
				+ ", subCat=" + subCat + "]";
	}
	
	
}
