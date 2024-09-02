package ro.itschool.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.itschool.entity.Article;
import ro.itschool.service.ArticleService;

import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class WelcomeController {

  private final ArticleService articleService;

  @GetMapping("/welcome")
  public String welcomePage(final Model model) {
    List<Article> articles = articleService.getAllArticles();
    model.addAttribute("articles", articles);
    return "welcome";
  }

}
