package org.yanivp.knowledgemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.yanivp.knowledgemanager.dao.ArticleDAO;
import org.yanivp.knowledgemanager.entity.Article;

public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDAO articleDAO;  
	
	@Override
	public boolean addArticle(Article article) {
		return articleDAO.addArticle(article);
	}

	@Override
	public Article findById(String id) {
		return articleDAO.findById(id);
	}

}
