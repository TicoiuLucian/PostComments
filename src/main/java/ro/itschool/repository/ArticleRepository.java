package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.itschool.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
