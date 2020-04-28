package br.ufrn.archanjo.bigbang.task;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 14/02/2020.
 */
@SpringBootApplication
@Slf4j
public class ArchanjoProjectBigbangTaskApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ArchanjoProjectBigbangTaskApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Starting application...");
	}

}
