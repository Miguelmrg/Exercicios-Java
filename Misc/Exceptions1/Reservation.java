package model.entities;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkout;

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkout) {
		if (!checkout.isAfter(checkIn)) {
			throw new DomainException("checkout date must be after checkin date.");
		}

		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public long duration() {
		return ChronoUnit.DAYS.between(checkIn, checkout);
	}

	public void updateDates(LocalDate checkIn, LocalDate checkout) {
		LocalDate now = LocalDate.now();

		if (checkIn.isBefore(now) || checkout.isBefore(now)) {
			throw new DomainException("reservation dates for update must be future dates.");
		}
		if (!checkout.isAfter(checkIn)) {
			throw new DomainException("checkout date must be after checkin date.");
		}

		this.checkIn = checkIn;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + fmt.format(checkIn) + ", check-out: " + fmt.format(checkout)
				+ ", " + duration() + " nights";
	}
}
