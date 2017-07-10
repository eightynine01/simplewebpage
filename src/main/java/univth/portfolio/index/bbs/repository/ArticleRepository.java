package univth.portfolio.index.bbs.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import univth.portfolio.index.bbs.domain.Article;

/**
 * Created by TaeHwan
 * 2017. 7. 9. PM 3:50
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{
//    Page<Article> findAllByTitle();
//    Page<Article> findAll(Pageable pageable);
}
