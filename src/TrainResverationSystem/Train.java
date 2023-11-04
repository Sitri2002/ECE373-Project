package TrainResverationSystem;

import java.util.ArrayList;

public class Train {

	private int trainCode;
	private int[] seatTiers;
	private ArrayList<Route> routeList;
	private ArrayList<Integer> schedule;
	private ArrayList<Passenger> passengerList;
	
public Train() {
	trainCode = 0;
	seatTiers = new int[3];
	routeList = new ArrayList<Route>();
	schedule = new ArrayList<Integer>();
	passengerList = new ArrayList<Passenger>();
}

public int getTrainCode() {
	return trainCode;
}

public void setTrainCode(int c) {
	trainCode = c;
}

public int getSeatTier(int i) {
	return seatTiers[i];
}

public void setSeat(int seat, int i) {
	seatTiers[i] = seat;
}

public void setSeatTiers(int[] seat) {
	seatTiers = seat;
}

public ArrayList<Route> getRouteList(){
	return routeList;
}

public ArrayList<Integer> getSchedule(){
	return schedule;
}

public ArrayList<Passenger> getPassengers(){
	return passengerList;
}

public void printRouteList() {
	
}

public void printSchedule() {
	
}

public void printPassengers() {
	
}

public void addPassenger(Passenger p) {
	
}

public void removePassenger(Passenger p) {
	
}

public void addRoute(Route r) {
	
}

public void removeRoute(Route r) {
	
}

public void addTimeToSchedule(int time) {
	
}

public void removeTimeFromSchedule(int time) {
	
}
	
}
