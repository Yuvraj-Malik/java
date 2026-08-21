import java.util.*;

class Vehicle{
    String vehicleNumber;
    String brand;
    double rentPerDay;

    Vehicle(String number, String vehicleBrand, double rent){
        vehicleNumber = number;
        brand = vehicleBrand;
        rentPerDay = rent;
    }

    public double calculateRent(int days){
        return rentPerDay * days;
    }

    public void displayDetails(){
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rent Per Day: " + rentPerDay);
    }
}

class Car extends Vehicle{

    Car(String number, String vehicleBrand, double rent){
        super(number, vehicleBrand, rent);
    }

    public double calculateRent(int days){
        double rent = rentPerDay * days;
        return rent * 1.20;
    }

    public void displayDetails(){
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rent Per Day: " + rentPerDay);
        System.out.println("Total Rent: " + calculateRent(5));
    }
}

class Bike extends Vehicle{

    Bike(String number, String vehicleBrand, double rent){
        super(number, vehicleBrand, rent);
    }

    public double calculateRent(int days){
        double rent = rentPerDay * days;
        return rent * 0.90;
    }

    public void displayDetails(){
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rent Per Day: " + rentPerDay);
        System.out.println("Total Rent: " + calculateRent(5));
    }
}

class Truck extends Vehicle{

    Truck(String number, String vehicleBrand, double rent){
        super(number, vehicleBrand, rent);
    }

    public double calculateRent(int days){
        return (rentPerDay * days) + 500;
    }

    public void displayDetails(){
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rent Per Day: " + rentPerDay);
        System.out.println("Total Rent: " + calculateRent(5));
    }
}

public class VehicleRental{
    public static void main(String args[]){

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("CAR101", "Toyota", 2000);
        vehicles[1] = new Bike("BIKE102", "Honda", 1000);
        vehicles[2] = new Truck("TRUCK103", "Tata", 3000);

        for(Vehicle v : vehicles){
            v.calculateRent(5);
            v.displayDetails();
            System.out.println();
        }
    }
}