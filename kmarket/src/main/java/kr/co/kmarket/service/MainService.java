package kr.co.kmarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket.dao.MainDao;
import kr.co.kmarket.vo.Category1Vo;

@Service
public class MainService {

	@Autowired
	private MainDao dao;
	
	public List<Category1Vo> selectCate1(){
		return dao.selectCate1();
	}
	
}
