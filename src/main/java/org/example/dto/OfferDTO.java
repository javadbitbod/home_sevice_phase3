package org.example.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.entity.enums.WorkTimeType;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString()
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OfferDTO extends BaseDTO<Long> {

    Long expertId;

    Long orderId;

    double offeredPrice;

    LocalDate offeredStartDate;

    int expertOfferedWorkDuration;

    LocalTime offeredStartTime;

    WorkTimeType workTimeType;

    LocalDate offerSignedDate;

    boolean isAccepted;
}
