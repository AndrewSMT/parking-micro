package com.andrew.parking.web.controller;


import com.andrew.parking.dto.ParkingDto;
import com.andrew.parking.service.ParkingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/parking")
public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping(value = "/{id}")
    public ParkingDto getParking(@PathVariable Long id) {
        return parkingService.getParking(id);
    }

    @GetMapping
    public List<ParkingDto> getParkings() {
        return parkingService.getParkings();
    }

    @PostMapping
    public ParkingDto createParking(@RequestBody ParkingDto parkingDto) {
        return parkingService.createParking(parkingDto);
    }

    @PutMapping(value = "/{id}")
    public ParkingDto updateParking(@PathVariable Long id, @RequestBody ParkingDto parkingDto) {
        return parkingService.updateParking(id, parkingDto);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteParking(@PathVariable Long id) {
        parkingService.deleteParking(id);
    }


}