import Transport.Plane;
import Transport.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {


    Plane plane;


    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(416, plane.getPlaneType().getCapacity());
    }

    @Test
    public void canGetWeight(){
        assertEquals(183500, plane.getPlaneType().getWeight());
    }

}


