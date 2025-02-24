package com.forza.restaurant.service;

import com.forza.restaurant.model.Reservation;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {
    private List<Reservation> reservations = new ArrayList<>();

    public Reservation saveReservation(Reservation reservation) {
        // Add validation logic here
        if (isTableAvailable(reservation.getDateTime(), reservation.getPartySize())) {
            reservation.setId(generateId());
            reservations.add(reservation);
            return reservation;
        }
        throw new RuntimeException("No tables available for the selected time and party size");
    }

    private boolean isTableAvailable(LocalDateTime dateTime, int partySize) {
        // Add availability checking logic here
        return true;
    }

    private Long generateId() {
        return System.currentTimeMillis();
    }

    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservations);
    }
}
