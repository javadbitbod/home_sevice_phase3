package ir.maktab.hwfinal03.entity;


import ir.maktab.hwfinal03.base.domain.BaseEntity;
import ir.maktab.hwfinal03.entity.users.Client;
import ir.maktab.hwfinal03.entity.users.Expert;
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
