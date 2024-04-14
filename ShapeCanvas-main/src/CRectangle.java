/**
 *class representing a rectangle, inherited CShape.
 */
public class CRectangle extends CShape {
    protected final int length;
    protected final int width;


    /**
     *constructor for CRectangle.
     *@param length length of rectangle.
     *@param width width of rectangle.
     */
    public CRectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Shape " + getShapeID() + ": RECTANGLE " + length + "x" + width;
    }
}
