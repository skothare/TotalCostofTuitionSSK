import java.math.*;
import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		// Calculates the total tuition for the 4-year undergraduate program

		int loopon = 1;
		do{
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("\n Enter your first year's cost of tuition (in $)");
			double tuition = input.nextDouble();	
			loopon = 2;
			double Tuition = Math.abs(tuition);
			double TotalTuition = Tuition;
			int count = 1;
			for(int i=1; i<4; i++){
				count++;
				System.out.println("\n Enter your approximate percent increase in tution for year " + count);
				double PercentIncrease = input.nextInt();
				Tuition += Tuition * (PercentIncrease/100.0);
				System.out.printf("\n Your tuition for year " + count + " is $ %4.2f",Tuition);
				TotalTuition += Tuition;
			}
			System.out.printf("\n Your total cost of tuition for the " + count + " years is $ %4.2f", TotalTuition);

		}
		catch(Exception e){
			System.out.println("\n Please enter a valid number.");
		}
		}while(loopon == 1);
	}
}