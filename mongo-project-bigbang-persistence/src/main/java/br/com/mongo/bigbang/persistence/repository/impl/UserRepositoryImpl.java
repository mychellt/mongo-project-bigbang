package br.com.mongo.bigbang.persistence.repository.impl;

import br.com.mongo.bigbang.domain.model.User;
import br.com.mongo.bigbang.domain.port.repository.UserRepository;
import br.com.mongo.bigbang.persistence.mapper.UserMapper;
import br.com.mongo.bigbang.persistence.repository.UserMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

	private final UserMongoRepository mongoRepository;

	private final UserMapper mapper;

	public UserRepositoryImpl(UserMongoRepository mongoRepository, UserMapper mapper) {
		this.mongoRepository = mongoRepository;
		this.mapper = mapper;
	}

	@Override
	public List<User> findAll() {
		return mongoRepository.findAll().stream().map(mapper::to).collect(Collectors.toList());
	}

	@Override
	public User findById(String id) {
		return mongoRepository.findById(id).stream().map(mapper::to).findFirst().orElse(null);
	}

	@Override
	public User saveOrUpdate(User user) {
		return mapper.to(mongoRepository.save(mapper.from(user)));
	}

	@Override
	public void deleteById(String id) {
		mongoRepository.deleteById(id);
	}

}
