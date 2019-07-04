package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RangerTest {

    @Before
    public void setUp () throws Exception {
    }
    @Test
    public void newRanger_ObjectGetsCorrectlyCreated()
            throws Exception{
        Ranger ranger = new Ranger("John",7,7390213,"NorthWest");
        assertEquals(true, ranger instanceof Ranger);
    }

    @Test
    public void newSightings_ObjectGetsCorrectlyCreated()
            throws Exception{
        Sightings sightings = new Sightings("NorthWest", "Our Pride Lies here!!");
        assertEquals(true, sightings instanceof Sightings);
    }
    @Test
    public void newFeedback_ObjectGetsCorrectlyCreated()
        throws Exception{
        Feedback feedback = new Feedback("Des", "Response", "Submit");
        assertEquals(true, feedback instanceof Feedback);
    }
    @After
    public void tearDown () throws Exception {
    }

}