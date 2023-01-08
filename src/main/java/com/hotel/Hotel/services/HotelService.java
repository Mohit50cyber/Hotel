package com.hotel.Hotel.services;


import com.hotel.Hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel get(String id);
}
