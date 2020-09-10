package kr.co.sboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;

@Repository
public class BoardDao {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public int insertBoard(BoardVO vo) {
		// 글을 insert 한 후 바로 해당 글번호 리턴
		int seq = mybatis.insert("mapper.board.INSERT_BOARD", vo);
		return seq;
	}
	
	public void insertFile(FileVO fvo) {
		mybatis.insert("mapper.board.INSERT_FILE", fvo);
	}
	
	public void selectBoard() {}
	
	public List<BoardVO> selectBoards(int start) {
		return mybatis.selectList("mapper.board.SELECT_BOARDS", start);
	}
	
	public void updateBoard() {}
	public void deleteBoard() {}
	
	public int selectCountBoard() {
		return mybatis.selectOne("mapper.board.SELECT_COUNT_BOARD");
	}
	
	
}
