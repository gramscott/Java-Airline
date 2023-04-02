import Employees.Pilot;
import Employees.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Linda", RankType.CAPTAIN, "G-ABCD");
    }

    @Test
    public void hasName(){
        assertEquals("Linda", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.CAPTAIN, pilot.getRankType());
    }

    @Test
    public void canFly(){
       assertEquals("I can fly", pilot.fly());
    }


}
