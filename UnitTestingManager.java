package TrainResverationSystem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class UnitTestingManager {

	@Test
	void testManager() {
		Manager m1 = new Manager();
		ArrayList<Train> trainsManaged = new ArrayList<Train>();
		
		//testing getName()
		assertEquals(null, m1.getName());
		
		//testing getUsername() 
		assertEquals(null, m1.getUsername());
		
		//testing getPassword() 
		assertEquals(null, m1.getPassword());
		
		//testing getEmail() 
		assertEquals(null, m1.getEmail());
		
		//testing train array list
		assertEquals(trainsManaged, m1.getTrainsManaged());
	}

	@Test
	void testSetName() {
		Manager m1 = new Manager();
		
		m1.setName("Emma");
		
		assertEquals("Emma", m1.getName());
	}

	@Test
	void testSetUsername() {
		Manager m1 = new Manager();
		
		m1.setUsername("emmahalferty");
		
		assertEquals("emmahalferty", m1.getUsername());
	}

	@Test
	void testSetPassword() {
		Manager m1 = new Manager();
		
		m1.setPassword("Kota!2345");
		
		assertEquals("Kota!2345", m1.getPassword());
	}

	@Test
	void testSetEmail() {
		Manager m1 = new Manager();
		
		m1.setEmail("emmahalferty@arizona.edu");
		
		assertEquals("emmahalferty@arizona.edu", m1.getEmail());
	}

	@Test
	void testSetTrainsManaged() {
		Manager m1 = new Manager();
		Train t1 = new Train();
		Train t2 = new Train();
		Train t3 = new Train();
		
		ArrayList<Train> trains = new ArrayList<Train>();
		ArrayList<Train> testArray = new ArrayList<Train>();
		
		trains.add(t1);
		trains.add(t2);
		trains.add(t3);
		
		testArray.add(t1);
		testArray.add(t2);
		testArray.add(t3);
		
		m1.setTrainsManaged(trains);
		
		assertEquals(testArray, m1.getTrainsManaged());
	}

	@Test
	// createRoute(String start_loc, String end_loc, int depart_time, int arrive_time, int setprice)
	void testCreateRoute() {
		Manager m1 = new Manager();
		Route testroute = new Route();
		String start_loc = "Tucson";
		String end_loc = "Phoenix";
		int depart_time = 1200;
		int arrive_time = 1600;
		int setprice = 45;
		
		testroute.setStartLocation(start_loc);
		testroute.setEndLocation(end_loc);
		testroute.setDepartureTime(depart_time);
		testroute.setArrivalTime(arrive_time);
		testroute.setPrice(setprice);
		
		assertEquals(testroute, m1.createRoute(start_loc, end_loc, depart_time, arrive_time, setprice));
	}

	@Test
	void testUpdateRoute() {
		Manager m1 = new Manager();
		Route route = new Route();
		
		route.setStartLocation("Tucson");
		route.setEndLocation("Phoenix");
		route.setDepartureTime(1200);
		route.setArrivalTime(1600);
		route.setPrice(45);
		
		Route route2 = new Route();
		
		m1.updateRoute(route2, "Tucson", "Phoenix", 1200, 1600, 45);
		
		assertEquals(route, route2);
	}

	@Test
	void testUpdateRouteStartLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateRouteEndLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateRouteDepartureTime() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateRouteArrivalTime() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateRoutePrice() {
		fail("Not yet implemented");
	}

	@Test
	void testCreateTrain() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateTrain() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateTrainCode() {
		fail("Not yet implemented");
	}

	@Test
	void testAddRouteToTrain() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveRouteFromTrain() {
		fail("Not yet implemented");
	}

	@Test
	void testCancelTrain() {
		fail("Not yet implemented");
	}

	@Test
	void testManagePassengers() {
		fail("Not yet implemented");
	}

	@Test
	void testRemovePassenger() {
		fail("Not yet implemented");
	}

	@Test
	void testAddPassenger() {
		fail("Not yet implemented");
	}

	@Test
	void testViewTrainStatus() {
		fail("Not yet implemented");
	}

	@Test
	void testViewTrains() {
		fail("Not yet implemented");
	}

}
