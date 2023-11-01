package ir.maktab.hwfinal03.entity;

import ir.maktab.hwfinal03.base.domain.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Services extends BaseEntity<Long> {

    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "service_id")
    private List<SubService> subServiceList;

    public Services(String name) {
        this.name = name;
    }
}