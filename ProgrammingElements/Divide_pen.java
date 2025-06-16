import java.util.Scanner;
public class Divide_pen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalPens = scanner.nextInt();
		int numberOfStudents = scanner.nextInt();
		int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;
        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
	}

}