package TurtleGraphics;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

//    public void moveToRight() {
//        this.row += 1;
//    }
//    public void moveToLeft(){
//        this.row -=1;
//    }
//    public void moveUp(){
//        this.column -=1;
//    }
//    public void moveDown(){
//        this.column +=1;
//    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}
