import Facade.HolidayBookingFacade;

public class Client {

	public static void main(String[] args) {

		HolidayBookingFacade facade = new HolidayBookingFacade();
		String pakge = "Gold";
		String destination = "Mauritius";
		String departure = "Delhi";
		facade.bookHolidayPackage(pakge, destination,departure );
	}

}
