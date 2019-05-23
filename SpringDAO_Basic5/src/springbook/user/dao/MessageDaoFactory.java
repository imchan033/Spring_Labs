package springbook.user.dao;

public class MessageDaoFactory implements DaoFactory{

	@Override
	public Dao makeDao() {
		Dao dao = new MessageDao(makeConnectionMaker());
		System.out.println("메세지 다오생성.");
		return dao;
	}

	@Override
	public ConnectionMaker makeConnectionMaker() {
		System.out.println("메세지 커넥션메이커 생성.");
		return new NConnectionMaker();
	}

}
