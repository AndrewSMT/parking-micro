package com.andrew.reservation.dto;

import com.andrew.reservation.model.ReservationStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ReservationDto {

    private Long reservationId;
    private LocalDateTime reservationStart;
    private LocalDateTime reservationEnd;
    private Long clientId;
    private Long spotId;
    private ReservationStatus reservationStatus;
}
