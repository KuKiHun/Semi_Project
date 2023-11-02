package com.javaclass.vo;

public class CartVO {
	private Integer cartno;
	private String cartOption;
	private Integer cartAmount;
	private Integer gno;
	private Integer mno;
	

	@Override
	public String toString() {
		return "CartVO [cartno=" + cartno + ", cartOption=" + cartOption + ", cartAmount=" + cartAmount + ", gno=" + gno
				+ ", mno=" + mno + "]";
	}


	public Integer getCartno() {
		return cartno;
	}


	public void setCartno(Integer cartno) {
		this.cartno = cartno;
	}


	public String getCartOption() {
		return cartOption;
	}


	public void setCartOption(String cartOption) {
		this.cartOption = cartOption;
	}


	public Integer getCartAmount() {
		return cartAmount;
	}


	public void setCartAmount(Integer cartAmount) {
		this.cartAmount = cartAmount;
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
