package univth.portfolio.index.bbs.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univth.portfolio.index.bbs.article.domain.Article;
import univth.portfolio.index.bbs.article.repository.ArticleRepository;

import java.util.List;

/**
 * Created by TaeHwan
 * 2017. 7. 9. PM 3:51
 */
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
    public List<Article> findAllArticle(){
        return articleRepository.findAll();
    }
    public void createArticle(List<Article> article){
        articleRepository.save(article);
    }
}
