package br.com.mongo.bigbang.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import br.com.mongo.bigbang.persistence.entity.EntityMongo;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@NoRepositoryBean
public interface AbstractMongoRepository<T extends EntityMongo> extends MongoRepository<T, String> {

}
