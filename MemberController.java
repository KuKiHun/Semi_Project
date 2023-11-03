package com.javaclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.service.MemberService;
import com.javaclass.vo.MemberVO;

@Controller // 클래스를 Spring의 컨트롤러 빈(Bean)으로 등록하는 어노테이션
public class MemberController { //웹 애플리케이션의 컨트롤러 역할을 하는 클래스, 웹 애플리케이션의 컨트롤러 역할을 하는 클래스
	
	@Autowired // Spring에서 의존성 주입을 수행하는 어노테이션으로, MemberService 객체를 주입
	private MemberService memberService;
	
	//요청 URL과 메서드를 매핑하는 어노테이션
	@RequestMapping("/signUp.do")//signUp 메서드: "/signUp.do" URL에 대한 요청을 처리하는 메서드로, 회원 가입 페이지로 이동
	public void signUp(MemberVO vo) {
		memberService.insertMember(vo);
		System.out.println("[memberController]member/signUp.do");
	}
	
	@RequestMapping("/index.do")//index 메서드: "/index.do" URL에 대한 요청을 처리하는 메서드로, 메인 페이지로 이동
	public void index() {
		System.out.println("[memberController]member/index.do");
		
	}
	
	@RequestMapping("/login.do")//login 메서드: "/login.do" URL에 대한 요청을 처리하는 메서드로, 로그인 페이지로 이동
	public void login() {
		System.out.println("[memberController]member/login.do");
		
	}
	
	@RequestMapping("/mypage.do")//mypage 메서드: "/mypage.do" URL에 대한 요청을 처리하는 메서드로, 마이페이지로 이동
	public void mypage() {
		System.out.println("[memberController]member/mypage.do");
		
	}

	@RequestMapping("/customerService.do")//customerService 메서드: "/customerService.do" URL에 대한 요청을 처리하는 메서드로, 고객 서비스 페이지로 이동
	public void customerService() {
		System.out.println("[memberController]member/customerService.do");
		
	}


}