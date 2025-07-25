class Vehicle {

    double mileage;
    double price;

   Vehicle(double mileage, double price){

      this.mileage = mileage;
      this.price = price;
   }

}

class Car extends Vehicle{

     double ownershipCost;
     int warrantyYears;
     int seatCapacity;
     String fuelType;

     Car(double mileage, double price, double ownershipCost, int warrantyYears, int seatCapacity, String fuelType) {
        super(mileage, price);
        this.ownershipCost = ownershipCost;
        this.warrantyYears = warrantyYears;
        this.seatCapacity = seatCapacity;
        this.fuelType = fuelType;   

     }

}

class Bike extends Vehicle{

     int cylinders;
     int gears;
     String coolingType;
     String wheelType;

     Bike(double mileage, double price, int cylinders, int gears, String coolingType, String wheelType) {
        super(mileage, price);
        this.cylinders = cylinders;
        this.gears = gears;
        this.coolingType = coolingType;
        this.wheelType = wheelType;   
     }

}

class Lamborghini extends Car{

      String modelType;

        Lamborghini(double mileage, double price, double ownershipCost, int warrantyYears, int seatCapacity, String fuelType, String modelType) {
             super(mileage, price, ownershipCost, warrantyYears, seatCapacity, fuelType);
             this.modelType = modelType;
        }

        void display(){
        System.out.println("Porsche Model: " + modelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Porsche extends Car{

      String modelType;

        Porsche(double mileage, double price, double ownershipCost, int warrantyYears, int seatCapacity, String fuelType, String modelType) {
             super(mileage, price, ownershipCost, warrantyYears, seatCapacity, fuelType);
             this.modelType = modelType;
        }

    void display(){
        System.out.println("Porsche Model: " + modelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Ducati extends Bike{

    String modelType;

    Ducati(double mileage, double price, int cylinders, int gears, String coolingType, String wheelType, String modelType) {
        super(mileage, price, cylinders, gears, coolingType, wheelType);
        this.modelType = modelType;
    }

    void display(){
        System.out.println("Ducati Model: " + modelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
    }
}

class Kawasaki extends Bike{

    String modelType;

    Kawasaki(double mileage, double price, int cylinders, int gears, String coolingType, String wheelType, String modelType) {
        super(mileage, price, cylinders, gears, coolingType, wheelType);
        this.modelType = modelType;
    }

    void display(){
        System.out.println("Ducati Model: " + modelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
    }
}

public class VehicleMain {

    public static void main(String[] args) {
        Lamborghini lambo = new Lamborghini(10.5, 200000, 5000, 5, 2, "Petrol", "Aventador");
        Porsche porsche = new Porsche(12.0, 150000, 4000, 4, 4, "Petrol", "911 Turbo");
        Ducati ducati = new Ducati(15.0, 20000, 2, 6, "Liquid", "Alloy", "Panigale V4R");
        Kawasaki kawasaki = new Kawasaki(14.0, 18000, 2, 6, "Air", "Spoke", "Ninja ZX-10R");

        ducati.display();
        kawasaki.display();
        lambo.display();
        porsche.display();  
    }
}