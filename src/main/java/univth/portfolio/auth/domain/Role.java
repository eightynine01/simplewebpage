package univth.portfolio.auth.domain;

import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by TaeHwan
 * 2017. 7. 17. PM 2:46
 */
@Entity @Setter
public class Role {
    @Id @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "privilege_id", referencedColumnName = "id"))
    private Collection<Privilege> privileges;
    public Role(String name){this.name = name;}
    protected Role(){}
}
