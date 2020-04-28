package br.ufrn.archanjo.bigbang.task.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 14/02/2020.
 */
@Configuration
@EnableScheduling
@ComponentScan("br.ufrn.archanjo.bigbang")
public class TaskConfiguration {

}
