/**
 *abstract class representing a general shape.
 */
public abstract class CShape {
    private static int idCounter = 0;
    private final int shapeID;

    /**
     *constructor for CShape.
     *initializes a unique ID.
     */
    protected CShape() {
        shapeID = ++idCounter;
    }

    /**
     *returns unique ID.
     *@return int unique ID.
     */
    public int getShapeID() {
        return shapeID;
    }

    @Override
    public abstract String toString();
}
