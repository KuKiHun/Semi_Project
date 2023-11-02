package com.javassem.vo;

public class BoardVO {

	private Integer bono;
	private String  category;
	private String  title;
	private String  readPermission;
	private String  writePermission;
	
	public Integer getBono() {
		return bono;
	}
	public void setBono(Integer bono) {
		this.bono = bono;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReadPermission() {
		return readPermission;
	}
	public void setReadPermission(String readPermission) {
		this.readPermission = readPermission;
	}
	public String getWritePermission() {
		return writePermission;
	}
	public void setWritePermission(String writepermission) {
		this.writePermission = writepermission;
	}
	
	@Override
	public String toString() {
		return "BoardVO [bono=" + bono + ", category=" + category + ", title=" + title + ", readPermission="
				+ readPermission + ", writepermission=" + writePermission + "]";
	}
	
	
}
