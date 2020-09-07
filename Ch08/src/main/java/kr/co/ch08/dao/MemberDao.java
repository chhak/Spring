package kr.co.ch08.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch08.vo.MemberVO;

@Repository
public class MemberDao {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public void insertMember(MemberVO vo) {
		mybatis.insert("mapper.member.INSERT_MEMBER", vo);
	}
	
	public void selectMember() {}
	
	public List<MemberVO> selectMembers() {
		return mybatis.selectList("mapper.member.SELECT_MEMBERS");
	}
	
	public void updateMember() {}
	public void deleteMember() {}	
}
