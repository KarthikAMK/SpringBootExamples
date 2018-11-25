package com.codebyamk.reservationmicroservice.reservation.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reservation")
public class Reservation {

	@Id
	private Long id;
	private LocalDateTime date;
	private Long userId;
	private Long resturantId;
	private int partSize;
	
	public Reservation() {}
	
	public Reservation(Long id,  Long userId, int partySize) {
		this.id = id;
		this.userId = userId;
		this.partSize = partySize;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getResturantId() {
		return resturantId;
	}
	public void setResturantId(Long resturantId) {
		this.resturantId = resturantId;
	}
	public int getPartSize() {
		return partSize;
	}
	public void setPartSize(int partSize) {
		this.partSize = partSize;
	}
}
