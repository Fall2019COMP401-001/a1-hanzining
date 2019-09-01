package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numberOfItems = scan.nextInt();
		String[] itemname = new String[numberOfItems];
		Double[] itemprice = new Double[numberOfItems];
		for (int i=0; i < numberOfItems; i++) {
			itemname[i] = scan.next();
			itemprice[i] = scan.nextDouble();
		}
		// set 2 arrays to store the name and unit price for each item entry
		
		int totalNumberOfCustomers = scan.nextInt();
		String[] firstname = new String[totalNumberOfCustomers];
		String[] lastname = new String[totalNumberOfCustomers];
		// set 2 arrays to store the first name and last name for each customer
		
		double[] price = new double[totalNumberOfCustomers];
		
		for (int j=0; j < totalNumberOfCustomers; j++) {
			// this loop runs one time for each different customer
			firstname[j] = scan.next();
			lastname[j] = scan.next();
			
			int typesOfItem = scan.nextInt();
			// how many different types of items 
			
			
			double totalprice = 0.0;
			for(int k=0; k < typesOfItem; k++) {
			// this loop go through all items this customer bought
				int amount = scan.nextInt();
				String name = scan.next();
				
				for (int n=0; n < numberOfItems; n++) {
				// this loop aims to get the unit price of the specific item
					if (name.equals(itemname[n])) {
						totalprice += amount * itemprice[n];
					}
				} // calculate individual total price
				price[j] = totalprice;
			}
			
		}
		
		double max = findValueMax(price);
		double min = findValueMin(price);
		double average = calculateAverage(price);
		
		System.out.println("Biggest: " + firstname[getIndexForMax(price)] + " " + lastname[getIndexForMax(price)]+ " " + "(" + String.format("%.2f", max) + ")");
		System.out.println("Smallest: " + firstname[getIndexForMin(price)] + " " + lastname[getIndexForMin(price)]+ " " + "(" + String.format("%.2f", min) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
		scan.close();
	}
		
	
// methods needed 
static double findValueMax(double[] price) {
		double cur_max = price[0];
		for (int i=1; i < price.length; i++) {
			if (price[i] > cur_max) {
				cur_max = price[i];
			}
		}
		return cur_max;
	}

static int getIndexForMax (double[] price) {
	double cur_max = price[0];
	int index = 0;
	for (int i=1; i < price.length; i++) {
		if (price[i] > cur_max) {
			cur_max = price[i];
			index=i;
		}
	}
	return index;
}

static double findValueMin(double[] price) {
	double cur_min = price[0];
	for (int i=1; i < price.length; i++) {
		if (price[i] < cur_min) {
			cur_min = price[i];
		}
	}
	
	return cur_min;
}

static int getIndexForMin (double[] price) {
	double cur_min = price[0];
	int index = 0;
	for (int i=1; i < price.length; i++) {
		if (price[i] < cur_min) {
			cur_min = price[i];
			index = i;
		}
	}
	return index;
}

static double calculateAverage(double[] price) {
	
	double sum = 0.0;
	
	for (int i=0; i<price.length; i++) {
		sum += price[i];
	}
	
	double average = sum/price.length;
	return average;
}

}
