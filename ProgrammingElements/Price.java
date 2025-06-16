import java.util.Scanner;
public class Price {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int price=sc.nextInt();
		int quantity=sc.nextInt();
		System.out.print("total price "+ price*quantity);
	}

}
