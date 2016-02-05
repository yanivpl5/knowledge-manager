package org.yanivp.knowledgemanager.dao;

import org.yanivp.knowledgemanager.entity.Article;

public interface ArticleDAO {
	public boolean addArticle(Article article);
	
	public Article findById(String id);
}
