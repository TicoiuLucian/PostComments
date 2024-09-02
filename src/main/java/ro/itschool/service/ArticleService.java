package ro.itschool.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.itschool.entity.Article;
import ro.itschool.repository.ArticleRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

  private final ArticleRepository articleRepository;

  public List<Article> getAllArticles() {
    return articleRepository.findAll();
  }

  public void save(final Article article) {
    article.setPublishedTimestamp(LocalDateTime.now());
    articleRepository.save(article);
  }
}
