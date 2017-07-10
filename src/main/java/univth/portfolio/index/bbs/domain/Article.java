package univth.portfolio.index.bbs.domain;

import univth.portfolio.common.domain.AbstractTimestampEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by TaeHwan
 * 2017. 7. 9. PM 2:20
 */
@Entity
public class Article extends AbstractTimestampEntity implements Serializable{
    protected Article(){}
    public Article(String title, String content){
        this.title = title;
        this.content = content;
    }
    @Id @GeneratedValue
    private Long id;
    private String title;
    @Lob
    private String content;
    @OneToMany(mappedBy = "article")
    private List<Comment> comments;
    public void addComments(Comment comment){
        comments.add(comment);
    }
}