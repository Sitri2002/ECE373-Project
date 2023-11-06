package TrainResverationSystem;

import java.util.ArrayList;

public class Manager {
	private String name;
	private String username;
	private String password;
	private String email;
	private ArrayList<Train> trainsManaged;
	
	public Manager() {
		name = null;
		username = null;
		password = null;
		email = null;
		
		trainsManaged = new ArrayList<Train>();
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
	
	public ArrayList<Train> getTrainsManaged() {
		return trainsManaged;
	}

	public void setTrainsManaged(ArrayList<Train> trainsManaged) {
		this.trainsManaged = trainsManaged;
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
	
	public void updateRoute(Route route, String start_loc, String end_loc, int depart_time, int arrive_time, int setprice) {	
		route.setStartLocation(start_loc);
		route.setEndLocation(end_loc);
		route.setDepartureTime(depart_time);
		route.setArrivalTime(arrive_time);
		route.setPrice(setprice);

	}
	
	public void updateRouteStartLocation(Route route, String start_loc) {
		route.setStartLocation(start_loc);
	}
	
	public void updateRouteEndLocation(Route route, String end_loc) {
		route.setEndLocation(end_loc);
	}
	
	public void updateRouteDepartureTime(Route route, int depart_time) {
		route.setDepartureTime(depart_time);
	}
	
	public void updateRouteArrivalTime(Route route, int arrive_time) {
		route.setArrivalTime(arrive_time);
	}
	
	public void updateRoutePrice(Route route, int setprice) {
		route.setPrice(setprice);
	}
	
	public Train createTrain(int train_code) {
		Train newtrain = new Train();
		
		newtrain.setTrainCode(train_code);
		
		if(!trainsManaged.contains(newtrain)) {
		trainsManaged.add(newtrain);
		}
		
		return newtrain;
	}
	
	public void updateTrain(Train train) {
		// maybe we don't need ?? I don't know what this what this would implement that's different than the individual functions below.
	}
	
	public void updateTrainCode(Train train, int traincode) {
		train.setTrainCode(traincode);
	}
	
	public void addRouteToTrain(Train train, Route route) {
		train.addRoute(route);
	}
	
	public void removeRouteFromTrain(Train train, Route route) {
		train.removeRoute(route);
	}
	
	public void cancelTrain(Train train) {
		if(trainsManaged.contains(train)){
		trainsManaged.remove(train);
		}
		
		train = null;
	}
	
	public void managePassengers(Train train) {
		// same with this... do we really need or just the two below?
	}
	
	public void removePassenger(Train train, Passenger p) {
		if(train.getPassengers().contains(p)){
			train.getPassengers().remove(p);
		}
	}
	
	public void addPassenger(Train train, Passenger p) {
		if(!train.getPassengers().contains(p)){
			train.getPassengers().add(p);
		}
	}
	
	public void viewTrainStatus(Train train) {
		if(trainsManaged.contains(train)) {
			System.out.println("Train " + train.getTrainCode() + " is currently " + train.getStatus());
		}
		
		else {
			System.out.println("Train could not be found. Please select a different train to view.");
		}
	}
	
	public void viewTrains() {
		for(Train train : trainsManaged) {
			for(Route route : train.getRouteList()) {
			if(trainsManaged.contains(train)) {
				System.out.println("Train " + train.getTrainCode() + " is currently " + train.getStatus());
				System.out.println("Train routes available: ");
				System.out.println("Departing from: " + route.getStartLocation() + " at " + route.getDepatureTime());
				System.out.println("Arriving at: " + route.getEndLocation() + " at " + route.getArrivalTime());
			}
			
			else {
				System.out.println("Train could not be found. Please select a different train to view.");
			}
		 }
		}
	}


}