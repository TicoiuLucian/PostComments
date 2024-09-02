package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.itschool.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
