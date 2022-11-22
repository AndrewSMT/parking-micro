package com.andrew.parking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Embeddable
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
    @Table(name = "parking")
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parkingId;

    @Column(name = "parking_name")
    private String parkingName;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "parking")
    private List<Spot> spots = new ArrayList<>();
}
