abstract class Vehicle {
    private String vehicleNumber;
    private int capacity;
    private String type;
    private double baseFare;

    public Vehicle(String vehicleNumber, int capacity, String type, double baseFare) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.baseFare = baseFare;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public int getCapacity() { return capacity; }
    public String getType() { return type; }
    public double getBaseFare() { return baseFare; }

    public abstract double calculateFare(double distance);
}

class Mini extends Vehicle {
    public Mini(String vehicleNumber, int capacity, double baseFare) {
        super(vehicleNumber, capacity, "Mini", baseFare);
    }

    public double calculateFare(double distance) {
        return getBaseFare() + distance * 8;
    }
}

class Sedan extends Vehicle {
    public Sedan(String vehicleNumber, int capacity, double baseFare) {
        super(vehicleNumber, capacity, "Sedan", baseFare);
    }

    public double calculateFare(double distance) {
        return getBaseFare() + distance * 10;
    }
}

class SUV extends Vehicle {
    public SUV(String vehicleNumber, int capacity, double baseFare) {
        super(vehicleNumber, capacity, "SUV", baseFare);
    }

    public double calculateFare(double distance) {
        return getBaseFare() + distance * 12;
    }
}

class Driver {
    private String name;
    private String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() { return name; }
    public String getLicenseNumber() { return licenseNumber; }
    public double getRating() { return rating; }
}

interface IRideService {
    void bookRide(Vehicle v, Driver d, String location, double distance);
    void endRide();
}

class CabGoApp implements IRideService {
    private Vehicle currentVehicle;
    private Driver currentDriver;
    private String location;
    private double fare;

    public void bookRide(Vehicle v, Driver d, String location, double distance) {
        this.currentVehicle = v;
        this.currentDriver = d;
        this.location = location;
        this.fare = v.calculateFare(distance);

        System.out.println("Ride booked:");
        System.out.println("Vehicle number: " + v.getVehicleNumber() + ", Type: " + v.getType());
        System.out.println("Driver: " + d.getName() + ", License: " + d.getLicenseNumber());
        System.out.println("Location: " + location);
        System.out.println("Fare: ₹" + fare);
    }

    public void endRide() {
        System.out.println("Ride completed. Pay ₹" + fare);
        currentVehicle = null;
        currentDriver = null;
        location = null;
        fare = 0;
    }
}

public class CabGoMain {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Mini("MH12AB1234", 4, 50);
        Driver driver1 = new Driver("Rahul", "LIC123456", 4.7);

        CabGoApp app = new CabGoApp();
        app.bookRide(vehicle1, driver1, "Pune Station", 10.5);
        app.endRide();
    }
}
