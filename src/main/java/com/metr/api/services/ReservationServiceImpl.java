package com.metr.api.services;

import com.metr.api.models.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Override
    public Reservation getReservationById(Long reservationId) {
        return null;
    }

    @Override
    public List<Reservation> getReservationsByUser(Long userId) {
        return null;
    }

    @Override
    public Reservation cancelReservationById(Long reservationId) {
        return null;
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return null;
    }
}
