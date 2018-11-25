package com.codebyamk.reservationmicroservice.reservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.codebyamk.reservationmicroservice.reservation.model.Reservation;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, String> {

	public Reservation findById(Long id);

	public Long deleteById(Long id);
	
}
