package com.metr.api.services;

import com.metr.api.models.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation getReservationById(Long reservationId);
    List<Reservation> getReservationsByUser(Long userId);
    Reservation cancelReservationById(Long reservationId);
    Reservation createReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
}
