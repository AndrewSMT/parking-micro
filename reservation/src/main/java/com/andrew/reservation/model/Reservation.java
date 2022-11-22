package com.andrew.reservation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationId;

    @Column(name = "reservation_start")
    private LocalDateTime reservationStart;

    @Column(name = "reservation_end")
    private LocalDateTime reservationEnd;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "spot_id")
    private Long spotId;

    @Enumerated(EnumType.STRING)
    private ReservationStatus reservationStatus;
}
