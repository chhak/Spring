package kr.co.sboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.BoardDao;
import kr.co.sboard.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDao dao;
	
	
	public void insertBoard(BoardVO vo) {
		dao.insertBoard(vo);
	}
	
}
