import java.util.*;
public class Age {
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
        int birthYear = sc.nextInt();;
        int currentYear = 2024;
        int age = currentYear - birthYear;

        System.out.println("age in " + currentYear + " is " + age);
    }
}
