package com.hotel.Hotel.services.Impl;

import com.hotel.Hotel.entity.Hotel;
import com.hotel.Hotel.exception.ResourceNotFoundException;
import com.hotel.Hotel.repository.HotelRepository;
import com.hotel.Hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class HotelServiceImpl implements HotelService {


    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel create(Hotel hotel) {

        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {

        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id not found " + id));
    }
}
