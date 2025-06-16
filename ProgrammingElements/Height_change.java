import java.util.*;
public class Height_change {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		int feet=height/12;
		int inches=(height % 12);
		System.out.print("height :-"+feet+"feet"+inches/2.54+"inches");
	}

}
