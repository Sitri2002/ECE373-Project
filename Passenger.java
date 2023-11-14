package TrainResverationSystem;

public class Passenger {

	private String name;
	private String password;
	private String username;
	private String email;
	private Train bookedTrain;
	private Route bookedRoute;
	private int seatTier;
	
	public Passenger() {
		name = null;
		password = null;
		username = null;
		email = null;
		
		bookedTrain = new Train();
		bookedRoute = new Route();
		seatTier = 0;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public String getName() {
		return name;
	}
	
	public void setUsername(String name) {
		username = name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String pswd) {
		password = pswd;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String e) {
		email = e;
	}
	
	public String getEmail() {
		return email;
	}
	
/*	public int getBookedTrainCode() {
		return bookedTrainCode;
	}

	public void setBookedTrainCode(int bookedTrainCode) {
		this.bookedTrainCode = bookedTrainCode;
	} */

	public Route getBookedRoute() {
		return bookedRoute;
	}

	public void setBookedRoute(Route bookedRoute) {
		this.bookedRoute = bookedRoute;
	}

	public Train getbookedTrain() {
		return bookedTrain;
	}

	public void setbookedTrain(Train train) {
		this.bookedTrain = train;
	}

	public void viewTrains() {
		if(bookedTrain != null) {
			System.out.println("Train " + bookedTrain.getTrainCode() + " is currently " + bookedTrain.getStatus());
			System.out.println("Train routes available: ");
			System.out.println("Departing from: " + bookedRoute.getStartLocation() + " at " + bookedRoute.getDepartureTime());
			System.out.println("Arriving at: " + bookedRoute.getEndLocation() + " at " + bookedRoute.getArrivalTime());
		}
		
		else {
			System.out.println("Train could not be found. Please select a different train to view.");
		}
	}
	
	public void viewTrainStatus() {
		if(bookedTrain != null) {
			System.out.println("Train " + bookedTrain.getTrainCode() + " is currently " + bookedTrain.getStatus());
		}
		
		else {
			System.out.println("Train could not be found. Please select a different train to view.");
		}
	}
	
	public void bookTrain(Train train, Route route) {
		train.addPassenger(this);
		this.setbookedTrain(train);
		
		for(Route r : train.getRouteList()) {
			if(train.getRouteList().contains(route)) {
				if(r == route) {
					setBookedRoute(r); // change routelist to be only one route? : UPDATED... maybe - it is kind of hard to iterate trhough and match routes
				}
		 }
		}
	}
	
	public void viewBooking() {
		System.out.println("Your upcoming booked train number" + bookedTrain.getTrainCode() + " is currently " + bookedTrain.getStatus());// add train status
		System.out.println("Your route is ");
		System.out.println("Departing from: " + bookedRoute.getStartLocation() + " at " + bookedRoute.getDepartureTime());
		System.out.println("Arriving at: " + bookedRoute.getEndLocation() + " at " + bookedRoute.getArrivalTime());
	}
	
	public void cancelBooking(Train train) {
		train.removePassenger(this);
		
		bookedTrain = null;
	}
	
	public void changeSeatTier(int new_tier) {
		seatTier = new_tier;
	}
	
	public int getSeatTier() {
		return seatTier;
	}


}