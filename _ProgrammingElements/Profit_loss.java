import java.util.Scanner;
public class Profit_loss {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double costPrice = scanner.nextDouble();
		double sellingPrice = scanner.nextDouble();
		double amount = sellingPrice - costPrice;
        double percentage = (amount / costPrice) * 100;
        if(amount>0) {
        	System.out.print("profit "+percentage+"%");
        }
        else if(amount<0) {
        	System.out.print("loss "+percentage+"%");
        }
        else {
        	System.out.print("no loss no profit ");
        }
	}

}


