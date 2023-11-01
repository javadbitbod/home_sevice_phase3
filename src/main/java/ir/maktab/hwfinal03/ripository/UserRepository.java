package ir.maktab.hwfinal03.ripository;



import ir.maktab.hwfinal03.entity.User;
import ir.maktab.hwfinal03.entity.enumeration.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByRole(UserRole role);

}
