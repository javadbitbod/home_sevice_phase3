package ir.maktab.hwfinal03.entity;

import ir.maktab.hwfinal03.base.domain.BaseEntity;
import ir.maktab.hwfinal03.entity.enumeration.OrderStatus;
import jakarta.persistence.Entity;

import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Orders extends BaseEntity<Long> {

    @ManyToOne
    private User customer;

    @ManyToOne
    private SubService subService;

    private String description;

    private Integer price;

    private LocalDate date;

    private LocalTime time;

    private String address;

    private OrderStatus status;
}
