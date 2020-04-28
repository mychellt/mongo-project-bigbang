package br.com.mongo.bigbang.domain.port.service;

import java.util.List;

import br.com.mongo.bigbang.domain.model.User;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
public interface UserService {
	List<User> getAll();
	User getOne(String id);
	User save(User user);
	void delete(String id);

}
