public class GasPurchase
{
  private int odometer;
  private double gallons;

  public GasPurchase(int miles, double amount)
  {
    this.odometer = miles;
    this.gallons = amount;
  }

  public int getOdometer()
  {
    return this.odometer;
  }

  public static double getGallons()
  {
    return this.gallons;
  }

  public String toString()
  {
    return "At " + this.odometer + " miles, bought " + this.gallons + " gallons of gas.";
  }

  public static void main(String args[])
  {
    GasPurchase gp = new GasPurchase(100, 10.0);
    System.out.println(gp);
    System.out.println(GasPurchase.getGallons());
    System.out.println(gp.getOdometer());
  }
}
