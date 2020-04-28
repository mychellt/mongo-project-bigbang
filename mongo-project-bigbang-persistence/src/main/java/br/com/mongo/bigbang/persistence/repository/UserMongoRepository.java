package br.com.mongo.bigbang.persistence.repository;

import org.springframework.stereotype.Repository;

import br.com.mongo.bigbang.persistence.entity.UserEntity;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Repository
public interface UserMongoRepository extends AbstractMongoRepository<UserEntity> {

}
