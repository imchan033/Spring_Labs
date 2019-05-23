package springbook.user.dao;

import springbook.user.domain.Domain;

//계좌관련 CRUD
public class AccountDao implements Dao{
	private ConnectionMaker connectionmaker;
	
	public AccountDao(ConnectionMaker simpleconnectionmaker){
		this.connectionmaker = simpleconnectionmaker;
		System.out.println("어카운트 생성.");
		//this.connectionmaker = new DConnectionMaker();
		//this.connectionmaker = new NConnectionMaker();
	}
	@Override
	public int insert(Domain domain) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("어카운트 인서트.");
		return 0;
	}

	@Override
	public int update(Domain domain) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("어카운트 업데이트.");
		return 0;
	}

	@Override
	public int delete(String id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("어카운트 딜리트.");
		return 0;
	}

	@Override
	public Domain select(String id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("어카운트 셀렉트.");
		return null;
	}

}
