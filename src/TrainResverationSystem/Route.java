package TrainResverationSystem;

import java.util.ArrayList;

public class Route {
	private String startingLocation;
	private String endLocation;
	private int departureTime;
	private int arrivalTime;
	private int price;
	private ArrayList<Passenger> passengerList;
	

public Route() {
	startingLocation = null;
	endLocation = null;
	departureTime = 0;
	arrivalTime = 0;
	price = 0;
	setPassengerList(new ArrayList<Passenger>());
}

public void setStartLocation(String location) {
	startingLocation = location;
}

public String getStartLocation() {
	return startingLocation;
}

public void setEndLocation(String location) {
	endLocation = location;
}

public String getEndLocation() {
	return endLocation;
}

public void setDepartureTime(int time) {
	departureTime = time;
}

public int getDepatureTime() {
	return departureTime;
}

public void setArrivalTime(int time) {
	arrivalTime = time;
}

public int getArrivalTime() {
	return arrivalTime;
}

public void setPrice(int price) {
	this.price = price;
}

public int getPrice() {
	return price;
}

public ArrayList<Passenger> getPassengerList() {
	return passengerList;
}

public void setPassengerList(ArrayList<Passenger> passengerList) {
	this.passengerList = passengerList;
}

public int getDuration() {
	int duration = 0;
	
	return duration;
}

}
