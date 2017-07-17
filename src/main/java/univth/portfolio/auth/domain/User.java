package univth.portfolio.auth.domain;

import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by TaeHwan
 * 2017. 7. 17. PM 2:48
 */
@Entity @Setter
public class User {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String email;
    private String password;

    private boolean enabled;
    private boolean tokenExpired;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
}
