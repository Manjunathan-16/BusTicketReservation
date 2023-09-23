import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Booking {

	String passengerName;
	int busNo;
	Date date;

	public Booking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the passenger name : ");
		passengerName = sc.next();
		System.out.println("Enter the bus number : ");
		busNo = sc.nextInt();
		System.out.println("Enter the date dd-mm-yyyy : ");
		String inputDate = sc.next();
		// inbuilt java fucntion is used for changing string to date
		SimpleDateFormat dateEntered = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateEntered.parse(inputDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		for (Bus bus : buses) {
			if (bus.getBusNo() == busNo) 
				capacity = bus.getCapacity();
			}

			int booked = 0;
			for (Booking book : bookings) {
				if (book.busNo == busNo && book.date.equals(date)) {
					
					booked++;
				}
			}
			return booked < capacity ? true : false;
		}

}
