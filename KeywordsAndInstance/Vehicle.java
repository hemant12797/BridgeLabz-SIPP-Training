
public class Vehicle {
    static double registrationFee = 5000.0;
    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car", "MH01AB1234");
        Vehicle v2 = new Vehicle("Sneha", "Scooter", "MH02CD5678");

        v1.displayDetails();
        System.out.println();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(6000.0);
        System.out.println("\nAfter Fee Update:");
        v1.displayDetails();
    }
}
