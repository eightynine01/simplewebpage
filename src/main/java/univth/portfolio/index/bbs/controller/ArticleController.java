package univth.portfolio.index.bbs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import univth.portfolio.index.bbs.domain.Article;
import univth.portfolio.index.bbs.service.ArticleService;

import java.util.List;

/**
 * Created by TaeHwan
 * 2017. 7. 9. PM 2:20
 */
@Controller
@RequestMapping("/article")
@Slf4j
public class ArticleController {
    private final ArticleService articleService;
    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/all")
    public String findAllArticle(){
        List<Article> articles = articleService.findAllArticle();
        log.debug("articles {}", articles);
        return "";
    }
    @PostMapping("/create")
    public String createArticle(Article article){
        articleService.createArticle(article);
        return "article";
    }
    @GetMapping("/{id}")
    public String viewArticle(@PathVariable(value = "id") Long id, Model model){
        model.addAttribute(articleService.findByArticle(id));
//        articleService.
        return "article";
    }
}