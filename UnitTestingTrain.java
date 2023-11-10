package TrainResverationSystem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class UnitTestingTrain {

	/* trainCode = 0;
		seatTiers = new int[3];
		routeList = new ArrayList<Route>();
		schedule = new ArrayList<Integer>();
		passengerList = new ArrayList<Passenger>(); */
	@Test
	void testTrain() {
		Train train = new Train();
		ArrayList<Route> r = new ArrayList<Route>();
		ArrayList<Integer> s = new ArrayList<Integer>();
		int[] seats = new int[3];
		ArrayList<Passenger> plist = new ArrayList<Passenger>();
		
		// testing all getters
		assertEquals(r, train.getRouteList());
		assertEquals(s, train.getSchedule());
		assertEquals(seats[0], train.getSeatTier(0));
		assertEquals(plist, train.getPassengers());
	}

	@Test
	void testSetTrainCode() {
		Train train = new Train();
		int code = 301;
		
		train.setTrainCode(code);
		
		assertEquals(code, train.getTrainCode());
	}

	@Test
	void testSetSeat() {
		Train train = new Train();
		int seat = 301;
		
		train.setSeat(301, 0);
		
		assertEquals(seat, train.getSeatTier(0));
	}

	@Test
	void testSetSeatTiers() {
		Train train = new Train();
		int[] array = new int[3];
		int seat1 = 301;
		int seat2 = 303;
		int seat3 = 305;
		
		array[0] = seat1;
		array[1] = seat2;
		array[2] = seat3;
		
		train.setSeatTiers(array);
		
		assertEquals(array, train.getSeatTiers());
	}

	@Test
	void testSetStatus() {
		Train train = new Train();
		String stat = "On time";
		
		train.setStatus(stat);
		
		assertEquals(stat, train.getStatus());
	}

	/* @Test
	void testPrintRouteList() {
		fail("Not yet implemented");
	}

	@Test
	void testPrintSchedule() {
		fail("Not yet implemented");
	}

	@Test
	void testPrintPassengers() {
		fail("Not yet implemented");
	} */

	@Test
	void testAddPassenger() {
		Train train = new Train();
		ArrayList<Passenger> plist = new ArrayList<Passenger>();
		Passenger p = new Passenger();
		
		plist.add(p);
		train.addPassenger(p);
		
		assertEquals(plist, train.getPassengers());
	}

	@Test
	void testRemovePassenger() {
		Train train = new Train();
		ArrayList<Passenger> plist = new ArrayList<Passenger>();
		Passenger p1 = new Passenger();
		Passenger p2 = new Passenger();
		Passenger p3 = new Passenger();
		
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.remove(p3);
		
		train.addPassenger(p1);
		train.addPassenger(p2);
		train.addPassenger(p3);
		train.removePassenger(p3);
		
		assertEquals(plist, train.getPassengers());
	}

	@Test
	void testAddRoute() {
		Train train = new Train();
		ArrayList<Route> rlist = new ArrayList<Route>();
		Route r = new Route();
		
		rlist.add(r);
		train.addRoute(r);
		
		assertEquals(rlist, train.getRouteList());
	}

	@Test
	void testRemoveRoute() {
		Train train = new Train();
		ArrayList<Route> rlist = new ArrayList<Route>();
		Route r1 = new Route();
		Route r2 = new Route();
		Route r3 = new Route();
		
		rlist.add(r1);
		rlist.add(r2);
		rlist.add(r3);
		rlist.remove(r3);
		
		train.addRoute(r1);
		train.addRoute(r2);
		train.addRoute(r3);
		train.removeRoute(r3);
		
		assertEquals(rlist, train.getRouteList());
	}

	@Test
	void testAddTimeToSchedule() {
		Train train = new Train();
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		int i = 3;
		
		ilist.add(i);
		train.addTimeToSchedule(i);
		
		assertEquals(ilist, train.getSchedule());
	}

	@Test
	void testRemoveTimeFromSchedule() {
		Train train = new Train();
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		Integer i1 = 3;
		Integer i2 = 11;
		Integer i3 = 33;
		
		ilist.add(i1);
		ilist.add(i2);
		ilist.add(i3);
		ilist.remove(i3);
		
		train.addTimeToSchedule(i1);
		train.addTimeToSchedule(i2);
		train.addTimeToSchedule(i3);
		train.removeTimeFromSchedule(i3);
		
		assertEquals(ilist, train.getSchedule());
	}

}
