package com.javaclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.dao.MemberDAOImpl;
import com.javaclass.vo.MemberVO;

//이 클래스를 Spring의 서비스 빈(Bean)으로 등록하는 어노테이션
@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired //Spring에서 의존성 주입을 수행하는 어노테이션으로, MemberDAOImpl 객체를 주입
	private MemberDAOImpl memberDAO;
	
	public void insertMember(MemberVO vo) {
		
		memberDAO.insertMember(vo);
		
	}

}
