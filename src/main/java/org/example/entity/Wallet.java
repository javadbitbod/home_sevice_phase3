package org.example.entity;

import org.example.base.domain.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Wallet extends BaseEntity<Long> {

    double balance;

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                '}';
    }
}
