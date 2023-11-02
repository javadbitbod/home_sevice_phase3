package org.example.entity.users;


import org.example.base.domain.BaseEntity;
import org.example.entity.Wallet;
import org.example.entity.users.enums.UserStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;



@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "users")
public class User extends BaseEntity<Long> {

//    @Enumerated(value = EnumType.STRING)
//    Role role;

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



