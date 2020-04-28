package br.com.mongo.bigbang.domain.adapter.service;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.mongo.bigbang.domain.model.User;
import br.com.mongo.bigbang.domain.port.repository.UserRepository;
import br.com.mongo.bigbang.domain.port.service.UserService;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
class UserServiceImplTest {

	private UserService service;

	@Mock
	private UserRepository repository;

	private User userA;

	private User userB;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);

		userA = User.builder().login("1L").password("UserA").build();
		userB = User.builder().login("2L").password("UserB").build();

		service = new UserServiceImpl(repository);
	}

	@Test
	void getAll() {
		BDDMockito.given(repository.findAll()).willReturn(Arrays.asList(userA, userB));

		List<User> all = service.getAll();

		Assertions.assertNotNull(all);
		Assertions.assertTrue(all.size() > 0);
	}

	@Test
	void getOne() {
		BDDMockito.given(repository.findById(ArgumentMatchers.anyString())).willReturn(userA);

		User one = service.getOne("1L");

		Assertions.assertNotNull(one);
		Assertions.assertTrue(one.getLogin().equalsIgnoreCase("1L"));
	}

	@Test
	void save() {
		BDDMockito.given(repository.saveOrUpdate(ArgumentMatchers.any())).willReturn(userB);
		User save = service.save(userB);
		Assertions.assertNotNull(save);
	}

	@Test
	void delete() {
		service.delete("1L");
		Mockito.verify(repository, Mockito.times(1)).deleteById(ArgumentMatchers.anyString());
	}

}