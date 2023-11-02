package com.javaclass.vo;

public class PostVO {
	
	private Integer pono;
	private String postTitle;
	private String postWriter;
	private String postContent;
	private String postDate;
	private Integer postCnt;
	private String postFilename;
	private String postFileaddr;
	private String postFilesize;
	private String postPass;
	private String postState;
	private Integer bono;
	private Integer mno;
	
	
	@Override
	public String toString() {
		return "PostVO [pono=" + pono + ", postTitle=" + postTitle + ", postWriter=" + postWriter + ", postContent="
				+ postContent + ", postDate=" + postDate + ", postCnt=" + postCnt + ", postFilename=" + postFilename
				+ ", postFileaddr=" + postFileaddr + ", postFilesize=" + postFilesize + ", postPass=" + postPass
				+ ", postState=" + postState + ", bono=" + bono + ", mno=" + mno + "]";
	}


	public Integer getPono() {
		return pono;
	}


	public void setPono(Integer pono) {
		this.pono = pono;
	}


	public String getPostTitle() {
		return postTitle;
	}


	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}


	public String getPostWriter() {
		return postWriter;
	}


	public void setPostWriter(String postWriter) {
		this.postWriter = postWriter;
	}


	public String getPostContent() {
		return postContent;
	}


	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}


	public String getPostDate() {
		return postDate;
	}


	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}


	public Integer getPostCnt() {
		return postCnt;
	}


	public void setPostCnt(Integer postCnt) {
		this.postCnt = postCnt;
	}


	public String getPostFilename() {
		return postFilename;
	}


	public void setPostFilename(String postFilename) {
		this.postFilename = postFilename;
	}


	public String getPostFileaddr() {
		return postFileaddr;
	}


	public void setPostFileaddr(String postFileaddr) {
		this.postFileaddr = postFileaddr;
	}


	public String getPostFilesize() {
		return postFilesize;
	}


	public void setPostFilesize(String postFilesize) {
		this.postFilesize = postFilesize;
	}


	public String getPostPass() {
		return postPass;
	}


	public void setPostPass(String postPass) {
		this.postPass = postPass;
	}


	public String getPostState() {
		return postState;
	}


	public void setPostState(String postState) {
		this.postState = postState;
	}


	public Integer getBono() {
		return bono;
	}


	public void setBono(Integer bono) {
		this.bono = bono;
	}


	public Integer getMno() {
		return mno;
	}


	public void setMno(Integer mno) {
		this.mno = mno;
	}
	
	
}
