import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating array list for  bus
		ArrayList<Bus> buses = new ArrayList<>();
		// Creating array list for booking
		ArrayList<Booking> bookings = new ArrayList<>();

		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, false, 12));
		buses.add(new Bus(3, true, 15));

		Scanner sc = new Scanner(System.in);
		int userInput = 1;

		for (Bus b : buses) {
			b.displayBusInfo();
		}

		while (userInput == 1) {
			System.out.print("Enter 1 for booking and 2 for exit - ");
			userInput = sc.nextInt();
			if (userInput == 1) {
				Booking booking = new Booking();
				if (booking.isAvailable(bookings, buses)) {
					// adding the booking in array list
					bookings.add(booking);
					System.out.println("Booking is successful");
				} else {
					System.out.println("Bus is full please try different bus");
				}
			}
		}
	}

}
