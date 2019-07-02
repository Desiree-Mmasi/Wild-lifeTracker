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
        Ranger ranger = new Ranger("John", "NorthWest");
        assertEquals(true, ranger instanceof Ranger);
    }
    @After
    public void tearDown () throws Exception {
    }
}