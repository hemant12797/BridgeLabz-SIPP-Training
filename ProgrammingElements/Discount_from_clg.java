import java.util.*;
public class Discount_from_clg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double fee = scanner.nextDouble();
		double discountPercent = scanner.nextDouble();
		double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("Discount Offered: " + discount + "%" +
                "Fee to Pay: " +finalFee);
	}

}

