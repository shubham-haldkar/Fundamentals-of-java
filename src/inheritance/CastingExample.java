package inheritance;

//updcasting and downcasting in java

class Vehicle{
    void drive(){
        System.out.println(" Driving vehicle");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println(" Driving car");
    }
    
    void speedUp(){
        System.out.println(" speeding up the car");
    } 
}

public class CastingExample {
    public static void main(String[] args) {
        //downcasting
        Vehicle v = new Car();
        Car car = (Car) v;
        car.drive();
        car.speedUp();

        //Upcasting
        Vehicle vh = new Car();
        vh.drive();
    }
}
