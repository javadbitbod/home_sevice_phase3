package org.example.entity;


import org.example.base.domain.BaseEntity;
import org.example.entity.users.Client;
import org.example.entity.users.Expert;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Score extends BaseEntity<Long> {

    @Min(1)
    @Max(5)
    int score;


    String comment;

    @ManyToOne
    Expert expert;

    @ManyToOne
    Client client;

    @OneToOne
    Order order;

    @Override
    public String toString() {
        return "Score{" +
                "score=" + score +
                ", expert=" + expert +
                ", client=" + client +
                ", order=" + order +
                '}';
    }
}
