package kr.co.ch08.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch08.vo.UserVO;

@Repository
public class UserDao {
	
	@Inject
	private JdbcTemplate jdbc;
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public void insertUser(UserVO vo) {
		
		// Spring jdbc 방식
		//String sql = "INSERT INTO `USER3` VALUES (?,?,?,?)";
		//Object[] values = {vo.getUid(), vo.getName(), vo.getHp(), vo.getAge()};
		//jdbc.update(sql, values);
		
		// Mybatis 방식
		mybatis.insert("mapper.user.INSERT_USER", vo);
	}
	
	public UserVO selectUser() {
		return null;
	}
	
	public List<UserVO> selectUsers() {
		
		String sql = "SELECT * FROM `USER3`";
		
		List<UserVO> users = jdbc.query(sql, new UserRowMapper());
		
		return users;
	}	
	
	public void updateUser() {}
	public void deleteUser() {}
	
}
