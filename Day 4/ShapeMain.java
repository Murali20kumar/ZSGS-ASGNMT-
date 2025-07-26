class Shape {

    public void printShape(){
        System.out.println("This is a shape.");
    }
}

class Polygon extends Shape{

    public void printShape(){
        System.out.println("Polygon is a shape.");
    }
}

class Rectangle extends Polygon{

    public void printShape(){
        System.out.println("Rectangle is a Polygon.");
    }
}

class Triangle extends Polygon{

    public void printShape(){
        System.out.println("Triangle is a Polygon.");
    }
}

class Square extends Rectangle{

    public void printShape(){
        System.out.println("Square is a Rectangle.");
    }
}

public class ShapeMain {
    public static void main(String [] args){
        Shape shape = new Shape();
        shape.printShape();

        Polygon polygon = new Polygon();
        polygon.printShape();

        Rectangle rectangle = new Rectangle();
        rectangle.printShape();

        Triangle triangle = new Triangle();
        triangle.printShape();

        Square square = new Square();
        square.printShape();
    }
}
