package TurtleGraphics;

import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    private Turtle smart = new Turtle();


    @Test
    public void turtleCanMovePenDownTest(){
        assertTrue(smart.penIsUp());
        smart.penDown();
        assertFalse(smart.penIsUp());
    }


    @Test
    public void turtleCanMovePenUpTest(){
        smart.penIsUp();
        assertTrue(smart.penIsUp());
    }
    @Test
    public void turtleCanTurnRightWhileFacingEastTest() {
        assertSame(EAST, smart.getCurrentDirection());
        smart.turnRight();
        assertSame(SOUTH, smart.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnLeftWhileFacingEastTest() {
        assertSame(EAST, smart.getCurrentDirection());
        smart.turnLeft();
        assertSame(NORTH, smart.getCurrentDirection());
    }

    @Test
    public void TurtleCanMoveFowardWHileFacingEastTest() {
     assertSame(EAST, smart.getCurrentDirection());
     assertEquals(new Position(0,0),smart.getPosition());
     smart.moveForward(0,0);
     assertEquals(new Position(0,0), smart.getPosition());
    }
}
