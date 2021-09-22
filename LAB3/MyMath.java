package MyMath;

public class MyMath 
{
    public static double myPow(double base, int exponent)
    {
        double value = 1;
        if (base == 0.0 && exponent == 0)
        {
            value = 0.0;
            return value;
        }
        else if (base != 0.0 && exponent == 0)
        {
            value = 1.0;
            return value;
        }
        else if(base != 0.0 && exponent > 0)
        {
            for (int i=0; i < exponent; i++)
                value *= base;
                return value; 
        }
        else
        {
            base = 1/base;
            for (int i = 0; i > exponent; i--)
                value *= base;
            return value;

        }
    }
    public static void main(String args []) 
    {
        double test1 = myPow(0.0, 0);
        System.out.println("0.0 to the power of 0 is " + test1 + ".");
        
        double test2 = myPow(1.0, 0);
        System.out.println("1.0 to the power of 0 is " + test2 + ".");

        double test3 = myPow(3.0, 4);
        System.out.println("3.0 to the power of 4 is " + test3 + ".");
        
        double test4 = myPow(2.0, -3);
        System.out.println("2.0 to the power of -3 is " + test4 + ".");
    }
}
