package ir.maktab.hwfinal03.entity;

import ir.maktab.hwfinal03.base.domain.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comment extends BaseEntity<Long> {


    private Integer rating;

    private String comment;

    @ManyToOne
    private User customer;

    @ManyToOne
    private SubService subService;
}