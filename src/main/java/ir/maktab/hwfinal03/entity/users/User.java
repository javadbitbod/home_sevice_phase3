package ir.maktab.hwfinal03.entity.users;


import ir.maktab.hwfinal03.base.domain.BaseEntity;
import ir.maktab.hwfinal03.entity.Wallet;
import ir.maktab.hwfinal03.entity.users.enums.Role;
import ir.maktab.hwfinal03.entity.users.enums.UserStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;



@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "users")
public class User extends BaseEntity<Long> {

    @Enumerated(value = EnumType.STRING)
    Role role;

    @OneToOne
    Wallet wallet;

    String firstName;

    String lastName;

    @Email
    String email;

    String password;

    @Enumerated(EnumType.STRING)
    UserStatus userStatus;

    LocalDate signUpDate;

    Boolean locked = false;

    Boolean enabled = false;

    boolean isDeleted;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userStatus=" + userStatus +
                ", signUpDate=" + signUpDate +
                '}';
    }


    }



