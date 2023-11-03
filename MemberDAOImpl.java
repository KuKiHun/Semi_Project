package com.javaclass.dao;

//필요한 Java 클래스를 가져옵니다.
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.vo.MemberVO;

@Repository("memberDAO") //이 클래스를 Spring의 빈(Bean)으로 등록하는 어노테이션
//MemberDAO 인터페이스를 구현하는 클래스
public class MemberDAOImpl implements MemberDAO{

	@Autowired //Spring에서 의존성 주입을 수행하는 어노테이션으로, SqlSessionTemplate 객체를 주입
	//SqlSessionTemplate : MyBatis와 Spring을 통합하는 데 사용되는 클래스
	private SqlSessionTemplate mybatis;
	//MemberVO 객체를 인자로 받아 데이터베이스에 새로운 회원 정보를 삽입
	public void insertMember(MemberVO vo) {
		//MyBatis를 사용하여 SQL 쿼리를 실행 
		//쿼리는 "MemberDAO.insertMember"로 지정되어 있으며 vo 매개변수를 쿼리에 매핑
		mybatis.insert("Member.insertMember", vo);
	}

}
