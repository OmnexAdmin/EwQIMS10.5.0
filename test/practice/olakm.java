package practice;

import java.util.Scanner;

public class olakm {

	public static void main(String[] args) {
		olakm ob= new olakm();
		ob.olaKMCalc(10);
	}
	public void olaKMCalc(int actualKm) {
		int defaultKm=25;
		int defaultPrice =250;
		int pricePerKm=9;
		int actualPrice;
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter the actual Kilometer travelled");
		//actualKm= scan.nextInt();
		if(actualKm<=defaultKm) {
			actualPrice=defaultPrice;
			System.out.println("the actual price for the travelled distance"+actualKm+ "is:RS."+actualPrice);

		}
		else {
			int temp=actualKm-defaultKm;
			actualPrice=defaultPrice +(temp*pricePerKm);
			System.out.println("the actual price for the travelled distance"+actualKm+ "is:RS."+actualPrice);
		}

	}

}
