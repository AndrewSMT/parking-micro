package com.andrew.parking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "spot", indexes = {@Index(name = "spot_parking_idx", columnList = "parking_id")})
public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long spotId;

    @Column(name = "spot_number")
    private String spotNumber;

    @ManyToOne
    @JoinColumn(name = "parking_id")
    private Parking parking;

    @Embedded
    private Car car;
}
