package kr.co.sboard.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.sboard.dao.UserDao;
import kr.co.sboard.vo.TermsVO;

@Service
public class UserService {

	@Inject
	private UserDao dao;
	
	public void selectUser() {}
	public void selectUsers() {}
	public void insertUser() {}
	public void updateUser() {}
	public void deleteUser() {}
	
	public TermsVO selectTerms() {
		return dao.selectTerms();
	}	
}
