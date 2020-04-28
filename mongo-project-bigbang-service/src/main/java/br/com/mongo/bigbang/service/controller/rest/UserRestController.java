package br.com.mongo.bigbang.service.controller.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mongo.bigbang.domain.port.service.UserService;
import br.com.mongo.bigbang.service.dto.UserDTO;
import br.com.mongo.bigbang.service.mapper.UserDTOMapper;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@RestController
@RequestMapping("/users")
public class UserRestController {

	private final UserService service;

	private final UserDTOMapper mapper;

	@Autowired
	public UserRestController(UserService service, UserDTOMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	@GetMapping("/")
	public ResponseEntity getAll() {
		List<UserDTO> samples = service.getAll().stream().map(mapper::from).collect(Collectors.toList());
		return ResponseEntity.ok(samples);
	}

}
