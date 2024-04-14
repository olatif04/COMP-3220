import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *class representing a canvas containing shapes.
 */
public class CCanvas {
    private final Set<CShape> shapes;

    /**
     *constructor for CCanvas.
     *initializes canvas with random shapes.
     */
    public CCanvas() { //changed hashset to linkedhashset
        shapes = new LinkedHashSet<>(); //removed hashset
        generateRandomShapes();
    }

    /**
     *generates 10 random non-duplicate shapes.
     */
    private void generateRandomShapes() {
        Random random = new Random();
        while (shapes.size() < 10) {
            switch (random.nextInt(4)) {
                case 0:
                    addShape(new COval(random.nextInt(100) + 1, random.nextInt(100) + 1));
                    break;
                case 1:
                    addShape(new CCircle(random.nextInt(100) + 1));
                    break;
                case 2:
                    addShape(new CRectangle(random.nextInt(100) + 1, random.nextInt(100) + 1));
                    break;
                case 3:
                    addShape(new CSquare(random.nextInt(100) + 1));
                    break;
            }
        }
    }

    /**
     *adds a shape to the canvas if it is not already present.
     *@param shape shape to be added.
     */
    private void addShape(CShape shape) {
        shapes.add(shape);
    }

    /**
     *returns a string of all shapes in the canvas.
     *@return string of all shapes in insertion order.
     */
    @Override
    public String toString() { //had to fix cause wasn't printing in order
        StringBuilder sb = new StringBuilder();
        sb.append("Following random shapes:\n");
        for (CShape shape : shapes) {
            sb.append(shape).append("\n");
        }
        return sb.toString();
    }
}
