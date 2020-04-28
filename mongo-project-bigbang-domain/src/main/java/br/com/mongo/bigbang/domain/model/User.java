package br.com.mongo.bigbang.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	private String login;
	private String password;
}
