package univth.portfolio.index.bbs.domain;

import univth.portfolio.common.domain.AbstractTimestampEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by TaeHwan
 * 2017. 7. 10. AM 8:35
 */
@Entity
public class Comment extends AbstractTimestampEntity implements Serializable{
    protected Comment(){}
    public Comment(String content){
        this.content = content;
    }
    @Id @GeneratedValue
    private Long id;
    @Lob
    private String content;
    @ManyToOne
    private Article article;
}
