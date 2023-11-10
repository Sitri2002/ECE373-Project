package TrainResverationSystem;

public class Driver {
	
	public static void main(String args[]) {
		// manager login
		String manager_name="Matthew";
		String manager_username="mwasko";
		String manager_password="admin";
		String manager_email="mwasko@arizona.edu";
		
		// create manager
		Manager m1 = new Manager();
		m1.setName(manager_name);
		m1.setUsername(manager_username);
		m1.setPassword(manager_password);
		m1.setEmail(manager_email);
		
		// should be empty train managed list
		m1.getTrainsManaged();
		
		// create a new route
		Route route1 = m1.createRoute("TUS", "PHX", 1500, 1700, 10);
		Train t1 = m1.createTrain(1830);
		m1.addRouteToTrain(t1, route1);
		
		m1.viewTrains();
		
		String passenger1_name="Passenger1";
		String passenger1_password="passeng";
		String passenger1_username="user1";
		String passenger1_email="passenger1@arizona.edu";
		
		// create passenger1
		Passenger p1 = new Passenger();
		p1.setName(passenger1_name);
		p1.setPassword(passenger1_password);
		p1.setUsername(passenger1_username);
		p1.setEmail(passenger1_email);
		
		p1.bookTrain(t1);
		
		System.out.println("Printing the booking details for p1:");
		
		p1.viewBooking();
		
		String passenger2_name="Passenger2";
		String passenger2_password="passeng";
		String passenger2_username="user2";
		String passenger2_email="passenger2@arizona.edu";
		
		// create passenger2
		Passenger p2 = new Passenger();
		p2.setName(passenger2_name);
		p2.setPassword(passenger2_password);
		p2.setUsername(passenger2_username);
		p2.setEmail(passenger2_email);
		
		p2.bookTrain(t1);
		
		System.out.println("Printing passengers:");
		t1.printPassengers();
		
		p1.cancelBooking(t1);
		
		System.out.println("Checking if the booking for p1 has been cancelled:");
		p1.viewBooking();
		
		System.out.println("Printing passengers after p1 cancelled:");
		t1.printPassengers();
		
	}
}
