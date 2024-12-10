/**
 * @author uday
 * An example of factory design pattern implementation. 
 */
interface Shape {
    void draw();
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing square...");

    }

}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing triangle...");

    }

}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle...");

    }

}

class ShapeFactory {
    public Shape create(String type) {
        switch (type) {
            case "square":
                return new Square();
            case "triangle":
                return new Square();
            case "circle":
                return new Square();
            default:
                throw new UnsupportedOperationException("can't create" + type);
        }
    }
}

public class ShapeFactoryExample {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.create("circle");
        shape1.draw();
    }
}