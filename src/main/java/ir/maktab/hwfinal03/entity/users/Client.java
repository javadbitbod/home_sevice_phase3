package ir.maktab.hwfinal03.entity.users;


import ir.maktab.hwfinal03.entity.Order;
import ir.maktab.hwfinal03.entity.Score;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Client extends User {




    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    List<Order> orderList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    List<Score> scoreList = new ArrayList<>();

    @Override
    public String toString() {
        return "CLIENT{" +
                "orderList=" + orderList +
                ", scoreList=" + scoreList +
                '}';
    }
}
