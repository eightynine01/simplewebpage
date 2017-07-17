package univth.portfolio.auth.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

/**
 * Created by TaeHwan
 * 2017. 7. 17. PM 2:49
 */
@Entity
public class Privilege {
    protected Privilege(){}
    public Privilege(String name){this.name = name;}
    @Id @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;


}
