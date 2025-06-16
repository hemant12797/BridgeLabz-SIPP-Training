import java.util.*;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            int num = sc.nextInt();
            if (num <= 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum of entered positive numbers: " + sum);
        sc.close();
    }
}
