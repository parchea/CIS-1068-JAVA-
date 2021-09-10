import java.util.Scanner;

public class Lab1
{
 public static String checking(double speed)
  {
    String res="";
    if (speed > 65.0)
      {
        res = "SPEEDING";
        return res;
      }
    else if (speed > 0.0 && speed <= 65.0)
      {
        res = "OK";
        return res;
      }
    else if (speed == 0.0)
      {
        res = "STOPPED";
        return res;
      }
    else if (speed < 0.0)
      {
        res = "BACKWARD";
        return res;
      }
    return  res;
  }
    public static void main(String args [])
    {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter your Speed: ");
      double fast = kb.nextDouble();
      String result = checking(fast);
      System.out.println(result);
    }
}
