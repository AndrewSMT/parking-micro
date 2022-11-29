package com.andrew.parking.service;

import com.andrew.parking.dto.ParkingDto;

import java.util.List;

public interface ParkingService {

    ParkingDto getParking(Long id);

    List<ParkingDto> getParkings();

    ParkingDto createParking(ParkingDto parkingDto);

    ParkingDto updateParking(Long id, ParkingDto parkingDto);

    void deleteParking(Long id);
}
