package springbook.user.dao;

import java.sql.Connection;

public class UserDaoFactory implements DaoFactory {

	@Override
	public Dao makeDao() {
		Dao dao = new UserDao(makeConnectionMaker());
		System.out.println("유저 다오생성.");
		return dao;
	}

	@Override
	public ConnectionMaker makeConnectionMaker() {
		// TODO Auto-generated method stub
		System.out.println("유저 커넥션메이커 생성.");
		return new NConnectionMaker();
	}

	
}
