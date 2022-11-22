package com.andrew.parking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "car")
public class Car {

    @Column(name = "model")
    private String model;

    @Column(name = "number")
    private String number;
}
