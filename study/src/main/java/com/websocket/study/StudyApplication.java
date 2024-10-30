package com.websocket.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

	/*@EnableJpaRepositories(basePackages = {
		"com.challenge.chat.domain.chat.repository.mysql",
		"com.challenge.chat.domain.member.repository"
	})
	@EnableMongoRepositories(basePackages = "com.challenge.chat.domain.chat.repository.mongo")*/
	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}

}
