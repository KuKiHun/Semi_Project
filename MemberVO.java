package com.javaclass.vo;


public class MemberVO {
	private Integer mno;
	private String memberId;
	private String memberPass;
	private String memberName;
	private String memberNickname;
	private String memberLevel;
	private String memberTel;
	private String memberEmail;
	private String memberPostcode;
	private String memberAddr;
	private String memberGender;
	private String memberBirth;
	private String joinDate;
	private Integer mileAge;
	
	@Override
	public String toString() {
		return "MemberVO [mno=" + mno + ", memberId=" + memberId + ", memberPass=" + memberPass + ", memberName="
				+ memberName + ", memberNickname=" + memberNickname + ", memberLevel=" + memberLevel + ", memberTel="
				+ memberTel + ", memberEmail=" + memberEmail + ", memberPostcode=" + memberPostcode + ", memberAddr="
				+ memberAddr + ", memberGender=" + memberGender + ", memberBirth=" + memberBirth + ", joinDate="
				+ joinDate + ", mileAge=" + mileAge + "]";
	}

	public Integer getMno() {
		return mno;
	}

	public void setMno(Integer mno) {
		this.mno = mno;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPass() {
		return memberPass;
	}

	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public String getMemberTel() {
		return memberTel;
	}

	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPostcode() {
		return memberPostcode;
	}

	public void setMemberPostcode(String memberPostcode) {
		this.memberPostcode = memberPostcode;
	}

	public String getMemberAddr() {
		return memberAddr;
	}

	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public Integer getMileAge() {
		return mileAge;
	}

	public void setMileAge(Integer mileAge) {
		this.mileAge = mileAge;
	}
	
	
	
	
	
	

}
