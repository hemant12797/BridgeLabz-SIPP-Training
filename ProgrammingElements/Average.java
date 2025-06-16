import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maths = scanner.nextInt();
		int physics = scanner.nextInt();
		int chemistry = scanner.nextInt();
		double average = (maths + physics + chemistry) / 3.0;
		System.out.println("average mark in PCM is " + average);
				
	}

}

