package org.yanivp.knowledgemanager.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.yanivp.knowledgemanager.entity.Article;

public class ArticleDAOImpl implements ArticleDAO {
	@Autowired
	private MongoOperations mongoOperations;
	
	@Override
	public boolean addArticle(Article article) {
		mongoOperations.insert(article);
		return true;
	}

	@Override
	public Article findById(String id) {
		return mongoOperations.findById(id, Article.class);
	}

}
