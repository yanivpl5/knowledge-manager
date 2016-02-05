package org.yanivp.knowledgemanager.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.yanivp.knowledgemanager.dao.ArticleDAO;
import org.yanivp.knowledgemanager.dao.ArticleDAOImpl;
import org.yanivp.knowledgemanager.service.ArticleService;
import org.yanivp.knowledgemanager.service.ArticleServiceImpl;

@Configuration
@ComponentScan({"org.yanivp.knowledgemanager.controller"})
public class ApplicationConfig {

	public @Bean ArticleDAO articleDAO() {
		return new ArticleDAOImpl();
	}
	
	public @Bean ArticleService articleService() {
		return new ArticleServiceImpl();
	}
}
