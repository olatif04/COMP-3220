/**
 *class representing an oval, inherited CShape.
 */
public class COval extends CShape {
    protected final int horizontalRadius;
    protected final int verticalRadius;

    /**
     *constructor for COval.
     *@param horizontalRadius horizontal radius of oval.
     * @param verticalRadius vertical radius of oval.
     */
    public COval(int horizontalRadius, int verticalRadius) {
        super();
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    @Override
    public String toString() {
        return "Shape " + getShapeID() + ": OVAL " + horizontalRadius + "x" + verticalRadius;
    }
}
