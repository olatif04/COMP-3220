/**
 *class representing a square, inherited CRectangle.
 */
public class CSquare extends CRectangle {

    /**
     *constructor for CSquare.
     *@param side side length of square.
     */
    public CSquare(int side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Shape " + getShapeID() + ": SQUARE " + super.length + "x" + super.width;
    }
}
