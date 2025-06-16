import java.util.Scanner;
public class Distance_in_yard$feet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double distance=sc.nextDouble();
		System.out.print("in yards =" + (distance/3) +"distance in miles ="+ (distance/1760));
	}
}
