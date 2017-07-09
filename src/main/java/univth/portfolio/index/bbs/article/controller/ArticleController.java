package univth.portfolio.index.bbs.article.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import univth.portfolio.index.bbs.article.domain.Article;
import univth.portfolio.index.bbs.article.service.ArticleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

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
    @GetMapping("/create")
    public String createArticle(){
        List<Article> articles = new ArrayList<>();

        for(int i=0;i<10000;i++){
            Article article = new Article();
            article.setTitle(String.valueOf(abs(new Random().nextInt())));
            article.setContent(String.valueOf(abs(new Random().nextInt())));
            articles.add(article);
        }


        long sTime = System.currentTimeMillis();
        articleService.createArticle(articles);
        long eTime = System.currentTimeMillis();
        long times = (eTime-sTime)/1000;
        log.info("article time = {}", times);
        return "article";
    }
}
