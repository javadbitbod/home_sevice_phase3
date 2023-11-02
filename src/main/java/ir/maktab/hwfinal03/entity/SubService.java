package ir.maktab.hwfinal03.entity;

import ir.maktab.hwfinal03.base.domain.BaseEntity;
import ir.maktab.hwfinal03.entity.users.Expert;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class SubService extends BaseEntity<Long> {

    
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Services service;
    
    private double basePrice;
    
    private String description;

    @ManyToMany(mappedBy = "subServiceList", fetch = FetchType.EAGER)
    List<Expert> expertList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_service_id")
    List<Order> orderList = new ArrayList<>();

    @Override
    public String toString() {
        return "SubService{" +
                "description='" + description + '\'' +
                ", basePrice=" + basePrice +
                ", service=" + service.getName() +
                '}';
    }

}