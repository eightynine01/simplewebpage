package univth.portfolio.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import univth.portfolio.auth.domain.Privilege;

/**
 * Created by TaeHwan
 * 2017. 7. 17. PM 2:56
 */
@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
    Privilege findByName(String name);
}
