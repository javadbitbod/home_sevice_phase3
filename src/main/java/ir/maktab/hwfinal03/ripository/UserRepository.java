package ir.maktab.hwfinal03.ripository;



import ir.maktab.hwfinal03.entity.User;
import ir.maktab.hwfinal03.entity.enumeration.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);

    User findByRole(UserRole role);

}
