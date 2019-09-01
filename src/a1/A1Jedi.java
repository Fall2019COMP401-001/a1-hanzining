package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfItems = scan.nextInt();
		String[] itemname = new String[numberOfItems];
		Double[] itemprice = new Double[numberOfItems];
		int[] itemamount = new int[numberOfItems];
		int[] customeramount = new int[numberOfItems];
		
		for (int i=0; i < numberOfItems; i++) {
			itemname[i] = scan.next();
			itemprice[i] = scan.nextDouble();
		}
		
		int totalNumberOfCustomers = scan.nextInt();
		
		for (int j=0; j < totalNumberOfCustomers; j++) {
			// the name does not matter
			scan.next();
			scan.next();
			int typesOfItem = scan.nextInt();
			
			for (int k=0; k < typesOfItem; k++) {
				int amount = scan.nextInt();
				String name = scan.next();
				for (int m=0; m < numberOfItems; m++) {
					if (name.equals(itemname[m])) {
						itemamount[m] += amount;
						customeramount[m] += 1;
					}
				}
			}
		}
		
	
		for (int n=0; n < numberOfItems; n++) {
			if (itemamount[n]== 0) {
				System.out.println("No customers bought " + itemname[n]);
			} else {
				System.out.println(customeramount[n] + " customers bought " + itemamount[n] + " " + itemname[n] );
			}
		}
		scan.close();
	}
}
		
	   

