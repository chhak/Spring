package kr.co.ch12.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch12.persistence.UserRepo;
import kr.co.ch12.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public void insertUser(UserVo vo) {
		repo.save(vo); // insert into ~ 수행
	}
	
	public void selectUser() {}
	
	public void selectUsers() {}
	
	public void updateUser() {}
	
	public void deleteUser() {}
	
}
