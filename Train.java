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
		for (int i = 0; i < routeList.size(); i++) {
			System.out.println(routeList.get(i).getStartLocation() + " -> " + routeList.get(i).getEndLocation());
		}
	}
	
	public void printSchedule() {
		// reference to route?
	}
	
	public void printPassengers() {
		for (int i = 0; i < passengerList.size(); i++) {
			System.out.println(passengerList.get(i).getName());
		}
	}
	
	public void addPassenger(Passenger p) {
		passengerList.add(p);
	}
	
	public void removePassenger(Passenger p) {
		passengerList.remove(p);
	}
	
	public void addRoute(Route r) {
		routeList.add(r);
	}
	
	public void removeRoute(Route r) {
		routeList.remove(r);
	}
	
	public void addTimeToSchedule(int time) {
		schedule.add(time);
	}
	
	public void removeTimeFromSchedule(int time) {
		schedule.remove(time);
	}
	
}
