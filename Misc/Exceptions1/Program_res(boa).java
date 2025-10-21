package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Checkin date (dd/MM/yyyy): ");
			LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
			System.out.print("Checkout date (dd/MM/yyyy): ");
			LocalDate checkout = LocalDate.parse(sc.next(), fmt);
	
			Reservation reservation = new Reservation(number, checkIn, checkout);
			System.out.println("Reservation: " + reservation);
	
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Checkin date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), fmt);
			System.out.print("Checkout date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.next(), fmt);
	
			reservation.updateDates(checkIn, checkout);
			System.out.println("Reservation: " + reservation);
		}
		catch (DomainException e) {
			System.out.println("error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("unexpected error. ");
		}
		sc.close();
	}
}

package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
