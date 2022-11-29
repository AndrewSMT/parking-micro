package com.andrew.reservation.service;

import com.andrew.reservation.dto.ReservationDto;

import java.util.List;

public interface ReservationService {

    ReservationDto getReservation(Long id);

    List<ReservationDto> getReservations();

    ReservationDto createReservation(ReservationDto reservationDto);

    ReservationDto updateReservation(Long id, ReservationDto reservationDto);

    void deleteReservation(Long id);
}
