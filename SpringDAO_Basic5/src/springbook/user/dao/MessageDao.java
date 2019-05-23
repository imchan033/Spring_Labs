package springbook.user.dao;

import springbook.user.domain.Domain;

//게시판 관련 (CRUD)
public class MessageDao implements Dao{
	private ConnectionMaker connectionmaker;
	public MessageDao(ConnectionMaker simpleconnectionmaker){
		this.connectionmaker = simpleconnectionmaker;
		System.out.println("메세지생성.");
		//this.connectionmaker = new DConnectionMaker();
		//this.connectionmaker = new NConnectionMaker();
	}
	
	@Override
	public int insert(Domain domain) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("메세지 인서트.");
		return 0;
	}

	@Override
	public int update(Domain domain) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("메세지 업데이트.");
		return 0;
	}

	@Override
	public int delete(String id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("메세지 딜리트.");
		return 0;
	}

	@Override
	public Domain select(String id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("메세지 셀렉트.");
		return null;
	}

}
