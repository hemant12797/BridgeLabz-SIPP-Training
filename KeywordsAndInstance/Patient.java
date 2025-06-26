
public class Patient {
    static String hospitalName = "Sunrise Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name, ailment;
    int age;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(301, "Meera", 45, "Fever");
        Patient p2 = new Patient(302, "Rahul", 33, "Fracture");

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();

        Patient.getTotalPatients();
    }
}
