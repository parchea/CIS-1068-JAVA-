import java.util.Scanner;

//Below is the class for checking what the speed is and return a string of what speed the user enter.
public class Lab2
{
  private static double fast;
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
    //Below is the class that take in what the user input and return the value.
    public static int getIntPrompt(String s)
    {
      Scanner kb = new Scanner(System.in);
      int retval;
  
      System.out.print(s);
      retval = kb.nextInt();
      return retval;
    }    

    //Below is the main program that run over and over again until the user enter a negative number.
      public static void main(String args [])
      {        
        double speed_sum = 0.0;
        double ok_sum = 0.0;
        double stop_sum = 0.0;
        int speed_count = 0;
        int ok_count = 0;
        int stop_count = 0;
        double average_speed = 0.0;
        double average_ok = 0.0;
        double average_stop = 0.0;
        
        while(fast >= 0)
        {  
          fast = getIntPrompt("Enter your Speed: ");
          String result = checking(fast); //This line need to be inside the loop and Can't be outside the loop.
          if(result .equals ("SPEEDING"))
          {  
            speed_sum += fast;
            speed_count += 1;
          }
          else if(result .equals ("OK"))
          {
            ok_sum += fast;
            ok_count += 1;
          }
          else if(result .equals ("STOPPED"))
          {
            stop_sum += fast;
            stop_count += 1;
          }
        }
        
        //Finding the average speed 
        average_speed = speed_sum/speed_count;
        average_ok = ok_sum/ok_count;
        average_stop = stop_sum/stop_count;
        
        
        //Checking if there are no input of the speed.
        if(speed_count == 0)
        {
          System.out.println(speed_count + " vehicle is SPEEDING.");
        }
        else
        {
          System.out.println(speed_count + " vehicle is SPEEDING with an average speed of " + average_speed + ".");
        }
        if(ok_count == 0)
        {
          System.out.println(ok_count + " vehicle is at an OK speed.");
        }
        else
        {
          System.out.println(ok_count + " vehicle is at an OK speed with an average speed of " + average_ok + "."); 
        }
        if(stop_count == 0)
        {
          System.out.println(stop_count + " vehicle is at a STOPPED speed.");
        }
        else
        {
        System.out.println(stop_count + " vehicle at a STOPPED speed with an average speed of " + average_stop + ".");
        }
      }
}
