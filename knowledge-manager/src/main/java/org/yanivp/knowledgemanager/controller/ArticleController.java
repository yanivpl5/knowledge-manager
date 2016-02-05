package org.yanivp.knowledgemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yanivp.knowledgemanager.entity.Article;
import org.yanivp.knowledgemanager.service.ArticleService;

@RestController
@EnableAutoConfiguration
public class ArticleController {
	private static final String ERROR = "Error";
	private static final String OK = "OK";
	@Autowired
	private ArticleService articleService; 
	
	@RequestMapping(value="/addArticle", method=RequestMethod.POST)
    public String addArticle(@RequestBody Article article) {
		if (articleService.addArticle(article)) {
			return OK;
		} else {
			return ERROR;
		}
	}

	@RequestMapping(value="/find", method=RequestMethod.GET)
    public Article findArticle(@RequestParam String id) {
		Article article = articleService.findById(id);
		return article;
	}
}
