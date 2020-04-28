package br.com.mongo.bigbang.persistence.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Configuration
@ComponentScan("br.com.mongo.bigbang.persistence")
@EnableMongoRepositories(basePackages = { "br.com.mongo.bigbang.persistence.repository" })
public class PersistenceConfiguration {

}
