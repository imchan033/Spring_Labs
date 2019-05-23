package springbook.user.dao;

import java.sql.Connection;

public interface DaoFactory {
	Dao makeDao();
	ConnectionMaker makeConnectionMaker();
}
