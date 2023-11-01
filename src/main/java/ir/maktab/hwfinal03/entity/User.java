package ir.maktab.hwfinal03.entity;
import ir.maktab.hwfinal03.base.domain.BaseEntity;
import ir.maktab.hwfinal03.entity.enumeration.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Users")
@EqualsAndHashCode(callSuper = false)
@ToString
public class User extends BaseEntity<Long> {
    @Pattern(regexp = "^[a-zA-Z\s]{3,}$", message = "Invalid name format!")
    private String firstname;
    @Pattern(regexp = "^[a-zA-Z\s]{3,}$", message = "Invalid last name format!")
    private String lastname;

    @Email
    @Column(unique = true)
    private String email;
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$", message = "Password must contain uppercase letters, lowercase letters, numbers and symbols(@$!%*?&#) with at least 8 characters.")
    private String password;

    @Enumerated(value = EnumType.STRING)
    private UserRole role;

    private LocalDateTime registrationDateTime;
    @Lob
    @Column(name = "profile_picture")
    @Size(max = 300 * 1024, message = "The size of the photo should not be more than 300kb.")
    private byte[] profilePicture;

    public User(String firstname, String lastname, String email, String password, UserRole role, LocalDateTime registrationDateTime) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.role = role;
        this.registrationDateTime = registrationDateTime;
    }

}
