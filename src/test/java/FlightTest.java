
import Employees.CabinCrewMember;
import Employees.Pilot;
import Employees.RankType;
import Passengers.Passenger;
import Transport.Flight;
import Transport.Plane;
import Transport.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    Pilot pilot;

    Passenger passenger;


    ArrayList<Passenger> ArrayList;

    CabinCrewMember cabinCrewMembers;

    Plane plane;

    PlaneType planeType;



    @Before
    public void setUp() {
        flight = new Flight("FR756", "IBZ", "GLA", "3.45PM", 416);
        pilot = new Pilot("Linda", RankType.CAPTAIN, "G-ABCD");
        plane = new Plane(PlaneType.BOEING747);
        passenger = new Passenger("Vincent", 1);
    }

    @Test
    public void hasEmptyPassengerList(){
        flight.setPassengers(ArrayList);
        assertEquals(null, flight.getPassengers());
        System.out.println(flight);
    }


    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void canCheckIfThereIsSeatsAvailable(){
        flight.addPassenger(passenger);
        flight.seatsAvailable();
        assertEquals(416, 0, flight.getSeats());
    }

    @Test
    public void hasPlane(){
        flight.setPlane(plane);
        assertEquals(PlaneType.BOEING747, flight.getPlane().getPlaneType());
    }

    @Test
    public void flightHasPilot() {
        flight.setPilot(pilot);
        assertEquals("Linda", flight.getPilot().getName());
    }

    @Test
    public void hasFlightNum(){
        assertEquals("FR756", flight.getFlightNum());
    }

    @Test
    public void hasDestination(){
        assertEquals("IBZ", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("3.45PM", flight.getDepartureTime());
    }

}
