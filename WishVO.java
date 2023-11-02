package com.javaclass.vo;

public class WishVO {
	private Integer wishno;
	private Integer gno;
	private Integer mno;
	
	@Override
	public String toString() {
		return "WishVO [wishno=" + wishno + ", gno=" + gno + ", mno=" + mno + "]";
	}

	public Integer getWishno() {
		return wishno;
	}

	public void setWishno(Integer wishno) {
		this.wishno = wishno;
	}

	public Integer getGno() {
		return gno;
	}

	public void setGno(Integer gno) {
		this.gno = gno;
	}

	public Integer getMno() {
		return mno;
	}

	public void setMno(Integer mno) {
		this.mno = mno;
	}
	

}
