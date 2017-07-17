package univth.portfolio.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import univth.portfolio.auth.domain.Role;

/**
 * Created by TaeHwan
 * 2017. 7. 17. PM 2:56
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByName(String name);
}
