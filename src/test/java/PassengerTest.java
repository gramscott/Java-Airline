import Passengers.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {


    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Vincent", 1);
    }


    @Test
    public void hasName(){
        assertEquals("Vincent", passenger.getName());
    }

    @Test
    public void hasBag(){
        assertEquals(1, 0, passenger.getNumOfBags());
    }
}
