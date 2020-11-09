package br.ufrn.archanjo.bigbang.task.schedules;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@Component
@Slf4j
public class Schedule {

	@Scheduled(fixedDelay = 1000L)
	public void execute() {
		log.info("Start...");
		log.info("End.");
	}
}
