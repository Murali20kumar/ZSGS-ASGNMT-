import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point(){
        System.out.println("Point default constructor");
        x = 0;
        y = 0;
    }

    public void  setPoint(int X, int Y) {
        x = X;
        y = Y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

     public void printPoint() {
        System.out.println("Circle center is (" + x + "," + y + ")");
    }

}

class Circle extends Point {
    private int radius;

    public Circle() {
        super(); 
     System.out.println("Circle default constructor");

        radius = 1;
    }

    public void setRadius(int r) {
        if (r > 0)
            radius = r;
        else
            radius = 1; 
    }

    public int getRadius() {
        return radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

}

public class CircleMain {
    public static void main (String [] args){
         Scanner sc = new Scanner(System.in);

       Circle c1 = new Circle();

       System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        c1.setPoint(x, y);
        c1.setRadius(r);

     
        c1.printPoint();
        System.out.println("Radius is " + c1.getRadius());
        System.out.printf("Area is %.2f\n", c1.area());

        sc.close();
    }
}
