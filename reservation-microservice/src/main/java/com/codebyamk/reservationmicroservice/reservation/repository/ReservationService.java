package com.codebyamk.reservationmicroservice.reservation.repository;

import java.util.List;

import com.codebyamk.reservationmicroservice.reservation.model.Reservation;

public interface ReservationService {

	public List<Reservation> getAllReservations();
	public Reservation getReservation(Long id);
	public void addReservation(Reservation reservation);
	public void updateReservation(Long id, Reservation reservation);
	public void deleteReservation(Long id);
}
