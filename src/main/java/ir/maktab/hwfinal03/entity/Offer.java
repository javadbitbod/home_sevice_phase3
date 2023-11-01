package ir.maktab.hwfinal03.entity;

import ir.maktab.hwfinal03.base.domain.BaseEntity;
import ir.maktab.hwfinal03.entity.enumeration.WorkTimeType;
import ir.maktab.hwfinal03.entity.users.Expert;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Offer extends BaseEntity<Long> {
    @ManyToOne
    Expert expert;

    @ManyToOne
    Order order;

    double offeredPrice;

    LocalDate offeredStartDate;

    int expertOfferedWorkDuration;

    Time offeredStartTime;

    WorkTimeType workTimeType;

    LocalDate offerSignedDate;

    boolean isAccepted;

    @Override
    public String toString() {
        return "Offer{" +
                "expert=" + expert +
                ", order=" + order +
                ", offeredPrice=" + offeredPrice +
                ", offeredStartDate=" + offeredStartDate +
                ", expertOfferedWorkDuration=" + expertOfferedWorkDuration +
                ", offeredStartTime=" + offeredStartTime +
                ", offerSignedDate=" + offerSignedDate +
                ", isAccepted=" + isAccepted +
                '}';
    }
}
