class TwoD {
    protected double x, y;

    public TwoD() {
        System.out.println("TwoD default constructor");
        x = 0.0;
        y = 0.0;
    }

    public TwoD(double x, double y) {
        System.out.println("TwoD constructor with two arguments");
        this.x = x;
        this.y = y;
    }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public double getX() { return x; }
    public double getY() { return y; }
}

class ThreeD extends TwoD {
    private double z;

    public ThreeD() {
        super(); 
        z = 0.0;
    }

    public ThreeD(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(double z) { this.z = z; }
    public double getZ() { return z; }

    public double distance(ThreeD other) {
        double dx = other.getX() - this.getX();
        double dy = other.getY() - this.getY();
        double dz = other.getZ() - this.getZ();
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }
}

public class Dclass {
    public static void main(String[] args) {
        ThreeD t1 = new ThreeD(); 
        t1.setX(1.0);
        t1.setY(2.0);
        t1.setZ(3.0);

        ThreeD t2 = new ThreeD(4.0, 6.0, 8.0); 

        double dist = t1.distance(t2);
        System.out.printf("Distance between t1 and t2 = %.2f\n", dist);
    }
}