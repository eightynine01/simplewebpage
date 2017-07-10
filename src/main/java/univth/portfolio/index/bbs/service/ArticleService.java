package univth.portfolio.index.bbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univth.portfolio.index.bbs.domain.Article;
import univth.portfolio.index.bbs.repository.ArticleRepository;

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
//        articleRepository.findAll()
        return articleRepository.findAll();
    }
    public Article findByArticle(Long id){ return articleRepository.findOne(id);}
    public void createArticle(Article article){
        articleRepository.save(article);
    }
}
