package ro.itschool.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.itschool.entity.Article;
import ro.itschool.entity.Comment;
import ro.itschool.service.ArticleService;
import ro.itschool.service.CommentService;

import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class ArticleController {

  private final ArticleService articleService;
  private final CommentService commentService;

  @GetMapping("/welcome")
  public String welcomePage(final Model model) {
    List<Article> articles = articleService.getAllArticles();
    model.addAttribute("articles", articles);
    model.addAttribute("emptyComment", new Comment());
    return "welcome";
  }

  @PostMapping("/add-comment/{articleId}")
  public String addArticle(
          @ModelAttribute(name = "emptyComment") Comment comment,
          @PathVariable(name = "articleId") Integer articleId) {
    commentService.saveComment(comment, articleId);
    return "redirect:/welcome";
  }

}
