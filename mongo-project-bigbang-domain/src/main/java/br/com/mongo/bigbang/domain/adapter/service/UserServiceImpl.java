package br.com.mongo.bigbang.domain.adapter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mongo.bigbang.domain.model.User;
import br.com.mongo.bigbang.domain.port.repository.UserRepository;
import br.com.mongo.bigbang.domain.port.service.UserService;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repository;

	@Autowired
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<User> getAll() {
		return repository.findAll();
	}

	@Override
	public User getOne(String id) {
		return repository.findById(id);
	}

	@Override
	public User save(User user) {
		return repository.saveOrUpdate(user);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
