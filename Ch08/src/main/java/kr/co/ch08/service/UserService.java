package kr.co.ch08.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.ch08.dao.UserDao;
import kr.co.ch08.vo.UserVO;

@Service
public class UserService {

	@Inject
	private UserDao dao;
	
	public void insertUser(UserVO vo) {
		dao.insertUser(vo);
	}
	
	public UserVO selectUser() {
		return null;
	}
	
	public List<UserVO> selectUsers() {
		return dao.selectUsers();
	}	
	
	public void updateUser() {}
	public void deleteUser() {}
	
}
