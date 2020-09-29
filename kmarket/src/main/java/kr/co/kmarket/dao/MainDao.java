package kr.co.kmarket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.Category1Vo;

@Repository
public interface MainDao {

	public List<Category1Vo> selectCate1();
	
}
