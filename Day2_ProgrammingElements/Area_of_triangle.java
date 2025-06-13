import java.util.*;
public class Area_of_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		int base=sc.nextInt();
		double area=height*base*0.5;
		System.out.print("area"+area*2.54);
	}
}
