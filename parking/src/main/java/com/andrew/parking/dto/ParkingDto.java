package com.andrew.parking.dto;

import com.andrew.parking.model.Address;
import com.andrew.parking.model.Spot;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ParkingDto {

    private Long parkingId;
    private String parkingName;
    private Address address;
    private List<Spot> spots = new ArrayList<>();

}
