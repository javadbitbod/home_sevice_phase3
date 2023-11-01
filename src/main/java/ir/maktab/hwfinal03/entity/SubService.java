package ir.maktab.hwfinal03.entity;

import ir.maktab.hwfinal03.base.domain.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubService extends BaseEntity<Long> {

    
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Services service;
    
    private Integer basePrice;
    
    private String description;
    

}