package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.println("Checkin date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		System.out.println("Checkout date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next()); // checkout PRECISA ser posterior à data de checkin

		if (!checkout.after(checkin)) {
			System.out.println("Error in reservation: checkout date must be after checkin date.");
		} else {
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.println("Checkin date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.println("Checkout date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());

			Date now = new Date();
			if(checkin.before(now)|| checkout.before(now)) {
				System.out.println("Error in reservation: reservation dates for update must be future");
			} else if (!checkout.after(checkin)) {
				System.out.println("Error in reservation: checkout date must be after checkin date.");
			} else {
			reservation.updateDates(checkin, checkout);
			System.out.println("Reservation: " + reservation);
		}

		sc.close();
	}

}
}