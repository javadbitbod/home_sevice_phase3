package org.example.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.entity.Service;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString()
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExpertDTO extends UserDTO {


    String imageData;

    int score;

    Service service;
}
