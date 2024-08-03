import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
public class Booking {
	String person_Name;
	int flight_no;
	Date date;
	String BoardingPoint;
	String Destination;
	Booking (Scanner sc){
		System.out.println("enter the pasenger");
		 person_Name=sc.nextLine();
		 
			
		 while(true) {
			 System.out.println("enter the flightno");
			 if(sc.hasNextInt()) {
			 flight_no=sc.nextInt();
			 sc.nextLine();
			 break;
			 
		 } else {
			 System.out.println("enter the vaild bus  number");
			 sc.nextLine();
		 }
		
		
	}
	System.out.println("Enter date dd-mm-YYYY");
	String dateInput=sc.nextLine();
	SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy");
	
	try {
		 date=df.parse(dateInput);
		
	}catch(ParseException e) {
		e.printStackTrace();
	}
		
	}
	
public boolean isAvailable() throws SQLException {
	BusDAO busdao=new BusDAO();
	BookingDAO bookingdoa = new BookingDAO();
	int capacity = busdao.getCapacity(flight_no);
	int booked = bookingdoa.getBookedCount(flight_no, date);
	return booked < capacity;
	
	
	
}
}
	

	
	
	


