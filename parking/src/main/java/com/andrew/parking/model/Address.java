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
@Table(name = "address")
public class Address {

    @Column(nullable = false, name = "city")
    private String city;

    @Column(nullable = false, name = "street")
    private String street;

    @Column(nullable = false, name = "number")
    private String number;
}
