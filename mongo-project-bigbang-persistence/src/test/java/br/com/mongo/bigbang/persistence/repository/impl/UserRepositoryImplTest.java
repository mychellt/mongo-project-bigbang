package br.com.mongo.bigbang.persistence.repository.impl;

import br.com.mongo.bigbang.domain.model.User;
import br.com.mongo.bigbang.domain.port.repository.UserRepository;
import br.com.mongo.bigbang.persistence.entity.UserEntity;
import br.com.mongo.bigbang.persistence.mapper.UserMapper;
import br.com.mongo.bigbang.persistence.repository.UserMongoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
class UserRepositoryImplTest {

	private UserRepository repository;

	@Mock
	private UserMongoRepository mongoRepository;

	@Mock
	private UserMapper mapper;

	private UserEntity entity;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);

		repository = new UserRepositoryImpl(mongoRepository, mapper);

		entity = new UserEntity();
		entity.setId("1L");
		entity.setCreatedDate(new Date());
		entity.setLastModifiedDate(new Date());
		entity.setLogin("Entity A");
	}

	@Test
	void findAll() {
		BDDMockito.given(mongoRepository.findAll()).willReturn(Arrays.asList(entity));

		List<User> all = repository.findAll();

		Assertions.assertNotNull(all);
		Assertions.assertTrue(all.size() > 0);
	}

	@Test
	void findById() {
	}

	@Test
	void saveOrUpdate() {
	}

	@Test
	void deleteById() {
	}

}