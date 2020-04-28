package br.com.mongo.bigbang.persistence.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;

import br.com.mongo.bigbang.domain.model.User;
import br.com.mongo.bigbang.persistence.entity.UserEntity;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Mapper(builder = @Builder(disableBuilder = true))
public interface UserMapper {
	UserEntity from(User source);
	User to(UserEntity source);
}
