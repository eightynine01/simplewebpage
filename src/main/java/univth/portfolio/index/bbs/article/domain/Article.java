package univth.portfolio.index.bbs.article.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by TaeHwan
 * 2017. 7. 9. PM 2:20
 */
@Entity @Getter @Setter
public class Article{
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String content;
    protected Article(){}
}