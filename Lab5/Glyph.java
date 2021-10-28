import java.util.Scanner;
import java.io.*;

public class Glyph
{
    private char me;
    private byte ascii;
    private int count;


    public Glyph(char me_assign, byte ascii_assign, int count_assign)
    {
        this.me = me_assign;
        this.ascii = ascii_assign;
        this.count = count_assign;
    }
    public int getCount()
    {
        return this.count;
    }
    public byte getAscii()
    {
        return this.ascii;
    }
    public char getMe()
    {
        return this.me;
    }
    public void Setcount()
    {
        this.count++;
    }
    public static int find (Glyph [] a, char c)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != null && a[i].me == c)
            {
                return i;
            }
        }
        return -1;
    }
    public static void sort(Glyph [] a)
    {
        for(int i = 0; i < a.length && a[i] != null; i++)
        {
            for(int j = i+1; j < a.length && a[j] != null; j++)
            {
                if(a[i].count < a[j].count)
                {
                    Glyph temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Glyph[] myArray = new Glyph[512];
        int c1 = 0;
        int helper = 0;
        int index = 0;
        Scanner inputstream = null;
        String filename = "E:\\CIS 1068\\Lab 5\\test.txt";
        
        try
        {
            inputstream = new Scanner(new File(filename));

        }
        catch (FileNotFoundException e)
        {
            System.out.println ("File not found: " + filename);
            System.exit(1);
        }

        while(inputstream.hasNextLine())
        {
            String line = inputstream.nextLine();
            for(int i = 0; i < line.length(); i++)
            {
                char cur = line.charAt(i);
                c1++;
                byte b = (byte)cur;
                int position = find(myArray, cur);
                if (position == -1)
                {
                    Glyph F1 = new Glyph(cur,b,1);
                    myArray[helper] = F1;
                    helper++;
                }
                else
                {
                    myArray[position].Setcount();
                }
            }
        }
        sort(myArray);
        System.out.println("Total of number of character in the file is " + c1);
        System.out.printf( "%-15s %-15s %-15s %n", "Character", "Ascii", "Frequency");
        for (int i = 0; i < myArray.length; i++)
        {
            double k1 = myArray[i].getCount();
            Glyph num = myArray[i];
            char h1 = myArray[i].getMe(); 
            System.out.printf("%-15s %-15d %-15.4f %n",(myArray[i].getMe()), (myArray[i].getAscii()), (k1 / c1));
        }
    }
}
