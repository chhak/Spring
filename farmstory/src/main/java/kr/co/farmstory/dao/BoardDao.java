package kr.co.farmstory.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.farmstory.vo.BoardVO;

@Repository
public class BoardDao {

	@Inject
	private SqlSessionTemplate mybatis;
	
	
	public void insertBoard() {}
	public void selectBoard() {}
	
	public List<BoardVO> selectBoards(String cate) {
		return mybatis.selectList("mapper.board.SELECT_BOARDS", cate);
	}
	
	public void updateBoard() {}
	public void deleteBoard() {}
	
	
}
