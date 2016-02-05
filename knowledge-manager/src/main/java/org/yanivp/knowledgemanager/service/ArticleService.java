package org.yanivp.knowledgemanager.service;

import org.yanivp.knowledgemanager.entity.Article;

public interface ArticleService {
	public boolean addArticle(Article article);
	
	public Article findById(String id);
}
