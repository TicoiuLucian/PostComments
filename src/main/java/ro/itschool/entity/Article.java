package ro.itschool.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Article {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String title;

  private String content;

  private String author;

  private LocalDateTime publishedTimestamp;

  private Boolean isDeleted;

  @OneToMany(mappedBy = "article")
  private List<Comment> comments = new ArrayList<>();

  public void addComment(final Comment comment) {
    comments.add(comment);
    comment.setArticle(this);
  }
}
