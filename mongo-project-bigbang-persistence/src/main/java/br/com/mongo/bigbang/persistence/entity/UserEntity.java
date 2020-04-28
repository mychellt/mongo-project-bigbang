package br.com.mongo.bigbang.persistence.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author Mychell  Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
@Document(collection = "user")
public class UserEntity extends EntityMongo {

	@Field("name")
	private String login;

	@Field("password")
	private String password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
