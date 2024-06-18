package com.ideas;

import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparingDouble;

public class ReservationSystem {
    private final List<Hotel> hotels;

    public ReservationSystem(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public Optional<Hotel> findCheapestHotel() {
        return hotels.stream().min(comparingDouble(Hotel::getRate));
    }
}
