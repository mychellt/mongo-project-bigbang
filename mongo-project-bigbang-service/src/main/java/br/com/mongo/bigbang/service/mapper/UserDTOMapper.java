package br.com.mongo.bigbang.service.mapper;

import br.com.mongo.bigbang.service.dto.UserDTO;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

import br.com.mongo.bigbang.domain.model.User;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
@Mapper(builder = @Builder(disableBuilder = true))
public interface UserDTOMapper {
	UserDTO from(User source);
	User to(UserDTO source);
}
