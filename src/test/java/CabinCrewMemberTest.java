import Employees.CabinCrewMember;
import Employees.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {


    CabinCrewMember cabinCrewMember1;

    CabinCrewMember cabinCrewMember2;



    @Before
    public void setUp(){
        cabinCrewMember1 = new CabinCrewMember("Erin", RankType.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Nicole", RankType.PURSER);

    }

    @Test
    public void crewMember1HasName(){
        assertEquals("Erin", cabinCrewMember1.getName());
    }

    @Test
    public void crewMember1HasRank(){
        assertEquals(RankType.FLIGHT_ATTENDANT, cabinCrewMember1.getRankType());
    }

    @Test
    public void crewMember1CanRelayMessages(){
        assertEquals("I can relay messages to passengers", cabinCrewMember1.relayMessages());
    }

    @Test
    public void crewMember2HasName(){
        assertEquals("Nicole", cabinCrewMember2.getName());
    }

    @Test
    public void crewMember2HasRank(){
        assertEquals(RankType.PURSER, cabinCrewMember2.getRankType());
    }

    @Test
    public void crewMember2CanRelayMessages(){
        assertEquals("I can relay messages to passengers", cabinCrewMember2.relayMessages());
    }

}
