package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		int totalNumberOfCustomers = scan.nextInt();
		Character[] firstname = new Character[totalNumberOfCustomers];
		String[] lastname = new String[totalNumberOfCustomers];
				
		for (int i=0; i < totalNumberOfCustomers; i++) {
			firstname[i] = scan.next().charAt(0);
			lastname[i] = scan.next();
			int count = scan.nextInt();
			
			double price = 0.0;
	
			for (int j=0; j < count; j++) {
				int amount = scan.nextInt();
				scan.next();
				double unitprice = scan.nextDouble();
				price += amount * unitprice;
			}
			
			System.out.println(firstname[i]+ "." + lastname[i]+ ":" + String.format("%.2f", price));
		}
	
	}
}
