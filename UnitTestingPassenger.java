package TrainResverationSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestingPassenger {

	/* 	name = null;
		password = null;
		username = null;
		email = null;
		bookedTrain = new Train();
		setBookedRoute(new Route());
		seatTier = 0;
	 */
	
	@Test
	void testPassenger() {
		Passenger p1 = new Passenger();
		Route r = new Route();
		Train t = new Train();
		
		// testing getters
		assertEquals(null, p1.getName());
		assertEquals(null, p1.getUsername());
		assertEquals(null, p1.getPassword());
		assertEquals(null, p1.getEmail());
		assertEquals(t, p1.getbookedTrain());
		assertEquals(r, p1.getBookedRoute());
		assertEquals(0, p1.getSeatTier());
	}

	@Test
	void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	void testSetUsername() {
		fail("Not yet implemented");
	}

	@Test
	void testSetPassword() {
		fail("Not yet implemented");
	}

	@Test
	void testSetEmail() {
		fail("Not yet implemented");
	}

	@Test
	void testSetBookedRoute() {
		Route r = new Route();
		Passenger p = new Passenger();
		
		p.setBookedRoute(r);
		
		assertEquals(r, p.getBookedRoute());
	}

	@Test
	void testSetbookedTrain() {
		Train t = new Train();
		Passenger p = new Passenger();
		
		p.setbookedTrain(t);
		
		assertEquals(t, p.getbookedTrain());
	}

	@Test
	void testViewTrains() {
		fail("Not yet implemented");
	}

	@Test
	void testViewTrainStatus() {
		fail("Not yet implemented");
	}

	@Test
	void testBookTrain() {
		fail("Not yet implemented");
	}

	@Test
	void testViewBooking() {
		fail("Not yet implemented");
	}

	@Test
	void testCancelBooking() {
		fail("Not yet implemented");
	}

	@Test
	void testChangeSeatTier() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSeatTier() {
		fail("Not yet implemented");
	}

}
