package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.ArticleDAO;
import com.example.demo.model.Article;
import com.example.demo.services.ArticleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleTest {
	
	@Autowired
	ArticleService articleService;
	
	@MockBean
	ArticleDAO articleDAO;
	
	@Test
	public void getArticlesTest() {
		when(articleDAO.findAll()).thenReturn(Stream.
				of(new Article(20,1,"title","category","url",0), new Article(22,1,"title","category","url",0))
				.collect(Collectors.toList()));
		assertEquals(2,articleService.getArticles().size());
	}
	
	@Test
	public void createArticlesTest() {
		Article a = new Article(70,1,"title","category","url",0);
		when(articleDAO.save(a)).thenReturn(a);
		assertEquals(a,articleService.createArticle(a));
	}
	
	/*@Test
	public void getArticleByTitre() {
		String title = "title";
		when(articleDAO.findArticleByTitre(title)).thenReturn((Article) Stream.of(new Article(20,1,"title","category","url",0)).collect(Collectors.toList()));
		assertEquals(1,((List<Article>) articleService.getArticleByTitre(title)).size());
	}
	
	@Test
	public void deleteArticleByIdTest() {
		Article a = new Article(70,1,"title","category","url",0);
		arcticleService.deleteArticleById(a.getId());
		verify(articleDAO,times(1)).delete(a);
	}*/

}
