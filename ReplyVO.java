package com.javaclass.vo;

public class ReplyVO {
	
	private Integer reno;
	private Integer pono;
	private String replyer;
	private String replyContent;
	private String replyDate;
	
	
	@Override
	public String toString() {
		return "ReplyVO [reno=" + reno + ", pono=" + pono + ", replyer=" + replyer + ", replyContent=" + replyContent
				+ ", replyDate=" + replyDate + "]";
	}


	public Integer getReno() {
		return reno;
	}


	public void setReno(Integer reno) {
		this.reno = reno;
	}


	public Integer getPono() {
		return pono;
	}


	public void setPono(Integer pono) {
		this.pono = pono;
	}


	public String getReplyer() {
		return replyer;
	}


	public void setReplyer(String replyer) {
		this.replyer = replyer;
	}


	public String getReplyContent() {
		return replyContent;
	}


	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}


	public String getReplyDate() {
		return replyDate;
	}


	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}
	

}
