package TrainResverationSystem;
public class Manager {
	private String name;
	private String username;
	private String password;
	private String email;
	
	public Manager() {
		name = null;
		username = null;
		password = null;
		email = null;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setUsername(String name) {
		this.username = name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String pswd) {
		this.password = pswd;
	}
	
	public String getPassword() {
		return password;
	}
		
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Route createRoute(String start_loc, String end_loc, int depart_time, int arrive_time, int setprice) {
		Route newroute = new Route();
		
		newroute.setStartLocation(start_loc);
		newroute.setEndLocation(end_loc);
		newroute.setDepartureTime(depart_time);
		newroute.setArrivalTime(arrive_time);
		newroute.setPrice(setprice);
		
		return newroute;
	}
	
	public void updateRoute(Route route) {
		
	}
	
	public Train createTrain(int train_code) {
		Train newtrain = new Train();
		
		newtrain.setTrainCode(train_code);
		
		
		return newtrain;
	}
	
	public void updateTrain(Train train) {
		
	}
	
	public void cancelTrain(Train train) {
		train = null;
	}
	
	public void managePassengers(Train train) {
		
	}
	
	public void viewTrainStatus() {
		
	}
	
	public void viewTrains() {
		
	}


}
