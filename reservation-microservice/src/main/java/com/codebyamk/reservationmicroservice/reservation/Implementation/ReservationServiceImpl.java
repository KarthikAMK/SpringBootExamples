package com.codebyamk.reservationmicroservice.reservation.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebyamk.reservationmicroservice.reservation.model.Reservation;
import com.codebyamk.reservationmicroservice.reservation.repository.ReservationRepository;
import com.codebyamk.reservationmicroservice.reservation.repository.ReservationService;

@Service("reservationService")
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;

	// Retrieve all rows from table and populate list with objects
	public List<Reservation> getAllReservations() {

		List<Reservation> reservations = new ArrayList<Reservation>();
		reservationRepository.findAll().forEach(reservations::add);

		return reservations;
	}

	// Retrieves one row from table based on given id
	public Reservation getReservation(Long id) {
		return reservationRepository.findById(id);

	}

	// Inserts row into table
	public void addReservation(Reservation reservation) {
		reservationRepository.save(reservation);
	}

	// Updates row in table
	public void updateReservation(Long id, Reservation reservation) {
		reservationRepository.save(reservation);
	}

	// Removes row from table
	public void deleteReservation(Long id) {
		reservationRepository.deleteById(id);
	}

}
