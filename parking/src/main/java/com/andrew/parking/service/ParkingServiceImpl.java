package com.andrew.parking.service;

import com.andrew.parking.dto.ParkingDto;
import com.andrew.parking.mapper.ParkingMapper;
import com.andrew.parking.model.Parking;
import com.andrew.parking.repository.ParkingRepository;
import com.andrew.parking.service.exception.ObjectNotFoundException;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService{

    private final ParkingRepository parkingRepository;

    ParkingMapper parkingMapper = Mappers.getMapper(ParkingMapper.class);

    public ParkingServiceImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Transactional
    @Override
    public ParkingDto getParking(Long id) {
        return parkingMapper.INSTANCE.parkingToParkingDto(parkingRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id, ParkingDto.class)));
    }

    @Transactional
    @Override
    public List<ParkingDto> getParkings() {
        return parkingMapper.INSTANCE.parkingsToParkingDtos(parkingRepository.findAll());
    }

    @Override
    public ParkingDto createParking(ParkingDto parkingDto) {
        Parking parking = parkingMapper.INSTANCE.parkingDtoToParking(parkingDto);
        return parkingMapper.INSTANCE.parkingToParkingDto(parkingRepository.save(parking));
    }

    @Override
    public ParkingDto updateParking(Long id, ParkingDto parkingDto) {
        Parking parkingFromDb = parkingRepository.findById(id).get();
        parkingDto.setParkingId(parkingFromDb.getParkingId());

        Parking parking = parkingMapper.INSTANCE.parkingDtoToParking(parkingDto);
        return parkingMapper.INSTANCE.parkingToParkingDto(parkingRepository.save(parking));
    }

    @Override
    public void deleteParking(Long id) {
        parkingRepository.deleteById(id);
    }
}
