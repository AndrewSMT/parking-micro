package com.andrew.reservation.mapper;

import com.andrew.reservation.dto.ReservationDto;
import com.andrew.reservation.model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    Reservation reservationDtoToReservation(ReservationDto parkingDto);

    ReservationDto reservationToReservationDto(Reservation parking);

    List<Reservation> reservationDtosToReservations(List<ReservationDto> parkingDtos);

    List<ReservationDto> reservationsToReservationDtos(List<Reservation> parkings);
}
