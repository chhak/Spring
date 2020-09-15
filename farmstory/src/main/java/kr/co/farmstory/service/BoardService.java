package kr.co.farmstory.service;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.farmstory.dao.BoardDao;
import kr.co.farmstory.vo.BoardVO;

@Service
public class BoardService {

	@Inject
	private BoardDao dao;
	
	
	public void insertBoard() {}
	public void selectBoard() {}
	
	public List<BoardVO> selectBoards(String cate) {
		return dao.selectBoards(cate);
	}
	
	public void updateBoard() {}
	public void deleteBoard() {}
	
}
