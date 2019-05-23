package springbook.user.dao;

public class AccountDaoFactory implements DaoFactory {

	@Override
	public Dao makeDao() {
		// TODO Auto-generated method stub
		Dao dao = new AccountDao(makeConnectionMaker());
		System.out.println("어카운트 다오 생성.");
		return dao;
	}

	@Override
	public ConnectionMaker makeConnectionMaker() {
		// TODO Auto-generated method stub
		System.out.println("어카운트 커넥션메이커 생성.");
		return new NConnectionMaker();
	}

}
