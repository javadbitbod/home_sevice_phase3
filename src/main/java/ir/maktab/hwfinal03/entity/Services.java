package ir.maktab.hwfinal03.entity;

import ir.maktab.hwfinal03.base.domain.BaseEntity;
import ir.maktab.hwfinal03.entity.users.Expert;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Services extends BaseEntity<Long> {

     String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id")
    List<Expert> expertList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id")
    List<SubService> subServiceList = new ArrayList<>();

    public Services(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                '}';
    }
}