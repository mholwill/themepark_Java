package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;




    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(14, 1.5, 40.0);
        visitor2 = new Visitor(18, 1.2, 40.0);
        visitor3 = new Visitor(18, 2.2, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedIn__true(){
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void isAllowedIn__false(){
        assertFalse(rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void chargeDoubleForHeight(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor3), 0.01);
    }
}
