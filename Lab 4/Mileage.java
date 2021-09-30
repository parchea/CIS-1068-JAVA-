import java.util.Scanner;

public class Mileage 
{
    public static void main (String[] args)
    {
        GasPurchase [] gp = new GasPurchase[100];
        Scanner kb = new Scanner(System.in);
        int count = 0;
        int Current_Mileage = 0;
        double Current_Mileage_per_Gallons = 0.0;
        double Current_Bought_Gallons = 0.0;
        int previ = 0;
        
        while (Current_Mileage >= 0)
            {
                System.out.print("Please enter your Current Mileage:" );
                Current_Mileage = kb.nextInt();
                System.out.print("Please enter your Current Gas Purchase: ");
                Current_Bought_Gallons = kb.nextDouble();
                
                if(Current_Mileage < 0)
                    {
                        System.exit(1);
                    }
        while (Current_Mileage < previ)
            {
                System.out.print("Please enter your Milage Greater than your pervious: ");
                Current_Mileage = kb.nextInt();

                if (Current_Mileage < 0)
                    {
                        System.exit(1);
                    }
            }
        GasPurchase curr = new GasPurchase(Current_Mileage, Current_Bought_Gallons);
        gp [count] = curr;

        if (count >= 1)
            {
                GasPurchase Previous_Mileage = gp [count -1];
                previ = Previous_Mileage.getOdometer();
                Current_Mileage_per_Gallons = (Current_Mileage - Previous_Mileage.getOdometer()) / Current_Bought_Gallons;
                System.out.println("Your Current mileage per gallons is: " + Current_Mileage_per_Gallons + ".");
            }
        count++;
            }
    }    
}
