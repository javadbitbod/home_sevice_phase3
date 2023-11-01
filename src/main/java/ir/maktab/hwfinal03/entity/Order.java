package ir.maktab.hwfinal03.entity;

import ir.maktab.hwfinal03.base.domain.BaseEntity;
import ir.maktab.hwfinal03.entity.enumeration.OrderStatus;
import ir.maktab.hwfinal03.entity.users.Client;
import ir.maktab.hwfinal03.entity.users.Expert;
import ir.maktab.hwfinal03.entity.users.User;
import jakarta.persistence.*;

import lombok.*;

import java.sql.Time;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Order extends BaseEntity<Long> {

    String description;

    LocalDate localDate;

    Time time;

    @Enumerated(EnumType.STRING)
    OrderStatus orderStatus;

    double paid;

    double clientOfferedPrice;

    int clientOfferedWorkDuration;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    List<Offer> offerList = new ArrayList<>();

    @ManyToOne
    Client client;

    @ManyToOne
    Expert expert;

    @ManyToOne
    SubService subService;

    @OneToOne
    Score score;


    @Override
    public String toString() {
        return "Order{" +
                "description='" + description + '\'' +
                ", localDate=" + localDate +
//                ", localTime=" + localTime +
                ", orderStatus=" + orderStatus +
                ", paid=" + paid +
//                ", client=" + client.getId() +
//                ", expert=" + expert.getId() +
//                ", Service=" + service.getName() +
//                ", Sub Service=" + subServiceList +
//                ", score=" + score.getScore() +
//                ", comment=" + comment.getText() +
                '}';
    }
}
