package br.com.mongo.bigbang.domain.port.repository;

import java.util.List;

import br.com.mongo.bigbang.domain.model.User;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
public interface UserRepository {
	List<User> findAll();
	User findById(String id);
	User saveOrUpdate(User user);
	void deleteById(String id);
}
