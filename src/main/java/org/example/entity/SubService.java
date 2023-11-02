package org.example.entity;

import org.example.base.domain.BaseEntity;
import org.example.entity.users.Expert;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
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
                "name='" + name + '\'' +
                ", service=" + service +
                ", basePrice=" + basePrice +
                ", description='" + description + '\'' +
                ", expertList=" + expertList +
                ", orderList=" + orderList +
                '}';
    }

}