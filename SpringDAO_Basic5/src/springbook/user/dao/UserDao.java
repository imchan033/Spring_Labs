package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import springbook.user.domain.Domain;
import springbook.user.domain.User;

public class UserDao implements Dao {
	//DB연결을 가지고 있는  SimpleConnectionMaker 클래스 사용
	//UserDao 각 SimpleConnectionMaker 를 의존 **********
	/*
	private SimpleConnectionMaker simpleconnectionmaker;
	public UserDao(){
		this.simpleconnectionmaker = new SimpleConnectionMaker();
	}
	*/
	
	//Interface 활용 타입제어
	//***UserDao 특정 클래스에 의존하지 않는다 ************
	private ConnectionMaker connectionmaker;
	public UserDao(ConnectionMaker simpleconnectionmaker){
		this.connectionmaker = simpleconnectionmaker;
		System.out.println("유저생성.");
		//this.connectionmaker = new DConnectionMaker();
		//this.connectionmaker = new NConnectionMaker();
	}
	
	
	//Data Add
//	public void add(User user) throws ClassNotFoundException , SQLException {
//		//Class.forName("oracle.jdbc.driver.OracleDriver");
//		//Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","spring","1004");
//		//Connection c = getConnection();
//		Connection c = connectionmaker.makeConnection();
//		PreparedStatement ps = c.prepareStatement("insert into users(id,name,password) values(?,?,?)");
//		ps.setString(1, user.getId());
//		ps.setString(2, user.getName());
//		ps.setString(3, user.getPassword());
//		
//		ps.executeUpdate();
//		
//		ps.close();
//		c.close();
//		
//	}
	
	//Data Get






	@Override
	public Domain select(String id) throws Exception {
//		Connection c = connectionmaker.makeConnection();
//		PreparedStatement ps = c.prepareStatement("select * from users where id =?");
//		ps.setString(1, id);
//		ResultSet rs = ps.executeQuery();
//		rs.next();
//		User user = new User();
//		user.setId(rs.getString("id"));
//		user.setName(rs.getString("name"));
//		user.setPassword(rs.getString("password"));
		System.out.println("유저 셀렉트.");
		return null;
	}

	@Override
	public int insert(Domain domain) throws Exception {
//		User user = (User)domain;
//		Connection c = connectionmaker.makeConnection();
//		PreparedStatement ps = c.prepareStatement("insert into users(id,name,password) values(?,?,?)");
//		ps.setString(1, user.getId());
//		ps.setString(2, user.getName());
//		ps.setString(3, user.getPassword());
//		
//		int result =ps.executeUpdate();
		System.out.println("유저 인서트.");
		
		return 0;
	}



	@Override
	public int delete(String id) throws Exception {
		System.out.println("유저 딜리트.");
		return 0;
	}


	@Override
	public int update(Domain domain) throws Exception {
		System.out.println("유저 업데이트.");
		return 0;
	}



	
	//Oracle -> MySql
	//중복관심에 대한 하나의 관심사로 모았다(DB연결)
	/*private Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","spring","1004");
		return c;
	}*/
	
	//2차 요구사항
	//벤더 마다 다른 연결을 가지고 싶다
	//벤더가 자기 회사의 연결을 강제 구현
	
	//3차 요구사항()
	//abstract protected Connection getConnection() throws ClassNotFoundException ,SQLException;

	
	
}
