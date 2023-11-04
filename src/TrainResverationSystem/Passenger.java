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
	
}

public void viewBookings() {
	
}

public void cancelBooking(Train train) {
	
}

public void changeSeatTier(int seat) {
	
}

public int getSeatTier() {
	return seatTier;
}


}
