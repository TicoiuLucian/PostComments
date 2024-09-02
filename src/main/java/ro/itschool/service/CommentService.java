package ro.itschool.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.itschool.entity.Article;
import ro.itschool.entity.Comment;
import ro.itschool.repository.CommentRepository;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CommentService {

  private final CommentRepository commentRepository;

  public void saveComment(final Comment comment, final Integer articleId) {
    Article article = new Article();
    article.setId(articleId);
    comment.setArticle(article);
    comment.setPublishedTimestamp(LocalDateTime.now());
    commentRepository.save(comment);
  }
}
