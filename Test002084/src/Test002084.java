enum ShapeType {
    CIRCLE, SQUARE, RECTANGLE;
}
 
abstract class Shape {
    private ShapeType type = ShapeType.SQUARE; //default ShapeType
 
    Shape(ShapeType type) {
        this.type = type;
    }
 
    public ShapeType getType() {
        return type;
    }
 
    abstract void draw();
}
 
public class Test002084 {
    public static void main(String[] args) {
        Shape shape = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing a " + getType());
            }
        };
        shape.draw();
    }
}