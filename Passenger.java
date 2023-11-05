package TrainResverationSystem;

public class Passenger {

	private String name;
	private String password;
	private String username;
	private String email;
	private int bookedTrainCode;
	private Route bookedRoute;
	private int seatTier;
	
	public Passenger() {
		name = null;
		password = null;
		username = null;
		email = null;
		
		bookedTrainCode = 0;
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
	
	public void viewTrains() {
		
	}
	
	public void viewTrainStatus() {
		
	}
	
	public void bookTrain(Train train) {
		train.addPassenger(this);
		
		bookedTrainCode = train.getTrainCode();
		bookedRoute = train.getRouteList().get(0); // change routelist to be only one route?
		seatTier = 0;
	}
	
	public void viewBookings() {
		// print the current train? (only one train booking possible currently)
	}
	
	public void cancelBooking(Train train) {
		bookedTrainCode = 0;
		bookedRoute = null;
		seatTier = 0;
		train.removePassenger(this);
	}
	
	public void changeSeatTier(int new_tier) {
		seatTier = new_tier;
	}
	
	public int getSeatTier() {
		return seatTier;
	}


}
