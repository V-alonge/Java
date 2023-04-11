package TurtleGraphics;


import sun.awt.geom.PathConsumer2D;

import static TurtleGraphics.Direction.*;

public class Turtle {
    private boolean penIsUp = true;
    private Direction direction = EAST;
    private Position position = new Position(0,0);
    private Turtle smart = new Turtle();


    public boolean penIsUp() {
        return penIsUp;
    }

    public void penDown() {
        penIsUp = false;
    }


    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        if(direction == NORTH) face(EAST);
        if(direction == WEST) face(NORTH);
        if(direction == SOUTH) face(WEST);
        if(direction == EAST) face(SOUTH);

    }
    private void face(Direction direction) {
        this.direction = direction;

    }

    public void turnLeft() {
        if(direction == SOUTH) face(EAST);
        if(direction == WEST) face(SOUTH);
        if(direction == NORTH) face(WEST);
        if(direction == EAST) face(NORTH);

    }

    public Position getPosition() {
        return position;
    }

    public void moveForward(int row, int column) {
        return ;

    }


}
