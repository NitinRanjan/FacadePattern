package Facade;

import services.CabBookinng;
import services.FlightBooking;
import services.HotelBooking;

public class HolidayBookingFacade {
	private FlightBooking flightBooking;
	private HotelBooking hotelBooking;
	private CabBookinng cabBookinng;
	public HolidayBookingFacade() {
		this.flightBooking = new FlightBooking();
		this.hotelBooking = new HotelBooking();
		this.cabBookinng = new CabBookinng();
	}

	public boolean bookHolidayPackage(String pakage, String destination, String departure) {
		flightBooking.bookFlight(pakage, destination, departure);
		hotelBooking.bookHotel(pakage, destination);
		cabBookinng.bookCab(pakage);
		return true;
	}
}
