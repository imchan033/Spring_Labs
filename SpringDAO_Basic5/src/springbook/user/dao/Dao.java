package springbook.user.dao;

import java.sql.SQLException;
import java.util.List;

import springbook.user.domain.Domain;

public interface Dao {
	int insert(Domain domain) throws Exception;
	int update(Domain domain) throws Exception;
	int delete(String id) throws Exception;
	Domain select(String id) throws Exception;
}
