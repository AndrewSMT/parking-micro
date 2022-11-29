package com.andrew.parking.mapper;

import com.andrew.parking.dto.ParkingDto;
import com.andrew.parking.model.Parking;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ParkingMapper {

    ParkingMapper INSTANCE = Mappers.getMapper(ParkingMapper.class);

    Parking parkingDtoToParking(ParkingDto parkingDto);

    ParkingDto parkingToParkingDto(Parking parking);

    List<Parking> parkingDtosToParkings(List<ParkingDto> parkingDtos);

    List<ParkingDto> parkingsToParkingDtos(List<Parking> parkings);
}
