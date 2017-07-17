package univth.portfolio.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import univth.portfolio.auth.domain.User;

/**
 * Created by TaeHwan
 * 2017. 7. 17. PM 2:55
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
