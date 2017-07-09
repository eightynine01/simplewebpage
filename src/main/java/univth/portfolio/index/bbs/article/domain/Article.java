package univth.portfolio.index.bbs.article.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by TaeHwan
 * 2017. 7. 9. PM 2:20
 */
@Entity @Data
public class Article{
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String content;
    public Article(){}
}