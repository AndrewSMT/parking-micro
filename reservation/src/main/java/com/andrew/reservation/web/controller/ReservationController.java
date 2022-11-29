package com.andrew.reservation.web.controller;


import com.andrew.reservation.dto.ReservationDto;
import com.andrew.reservation.service.ReservationService;
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
@RequestMapping("/api/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping(value = "/{id}")
    public ReservationDto getReservation(@PathVariable Long id) {
        return reservationService.getReservation(id);
    }

    @GetMapping
    public List<ReservationDto> getReservations() {
        return reservationService.getReservations();
    }

    @PostMapping
    public ReservationDto createReservation(@RequestBody ReservationDto reservationDto) {
        return reservationService.createReservation(reservationDto);
    }

    @PutMapping(value = "/{id}")
    public ReservationDto updateReservation(@PathVariable Long id, @RequestBody ReservationDto reservationDto) {
        return reservationService.updateReservation(id, reservationDto);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }


}