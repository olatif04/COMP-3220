/**
 *class representing a circle, inherited COval.
 */
public class CCircle extends COval {

    /**
     *constructor for CCircle.
     *@param radius radius of circle.
     */
    public CCircle(int radius) {
        super(radius, radius);
    }

    @Override
    public String toString() {
        return "Shape " + getShapeID() + ": CIRCLE " + super.horizontalRadius;
    }
}
