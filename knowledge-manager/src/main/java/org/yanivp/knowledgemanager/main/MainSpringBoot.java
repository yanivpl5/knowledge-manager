package org.yanivp.knowledgemanager.main;

import org.springframework.boot.SpringApplication;

public class MainSpringBoot {

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(MongoConfiguration.class, ApplicationConfig.class);
		app.run(args);
    }
}
