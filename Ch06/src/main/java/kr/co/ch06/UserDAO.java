package kr.co.ch06;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	@Inject
	private JdbcTemplate jdbc;

	public void insertUser() {
		Object[] values = {"S101", "ȫ�浿", "010-1123-1234", 40};		
		jdbc.update("INSERT INTO `USER1` VALUES (?,?,?,?)", values);
	}
	public void selectUser() {}
	public void selectUsers() {}
	public void updateUser() {}
	public void deleteUser() {}
	
}
