package kr.co.ch07.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.ch07.dao.UserDao;
import kr.co.ch07.vo.UserVO;

@Service
public class UserService {

	@Inject
	private UserDao dao;
	
	public void insertUser(UserVO vo) {
		dao.insertUser(vo);
	}
	
	
	public void selectUser() {}
	public void selectUsers() {}
	public void updateUser() {}
	public void deleteUser() {}
}
