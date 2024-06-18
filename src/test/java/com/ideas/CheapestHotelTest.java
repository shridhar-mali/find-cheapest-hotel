package com.ideas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheapestHotelTest {

    @Test
    public void findCheapestHotel(){
        Hotel miamiBeach = new Hotel(80, "Miami Beach");
        Hotel miamiDowntown = new Hotel(120, "Miami Downtown");
        Hotel miamiMidtown = new Hotel(100, "Miami Midtown");
        List<Hotel> hotelList = Arrays.asList(miamiBeach, miamiDowntown, miamiMidtown);
        ReservationSystem reservationSystem = new ReservationSystem(hotelList);
        Optional<Hotel> cheapestHotel = reservationSystem.findCheapestHotel();
        assertTrue(cheapestHotel.isPresent());
        assertEquals(miamiBeach, cheapestHotel.get());
    }

    @Test
    public void findCheapestHotelEmptyList() {
        List<Hotel> hotelList = new ArrayList<>();
        ReservationSystem reservationSystem = new ReservationSystem(hotelList);
        Optional<Hotel> cheapestHotel = reservationSystem.findCheapestHotel();
        assertTrue(cheapestHotel.isEmpty());
    }
}
