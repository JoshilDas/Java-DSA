package bit_manipulation;

import java.util.*;


//Brian Kernighan Algorithm
public class CountSetBits
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to count no. of ones in its binary form : ");

        //TCS NQT Input Simulation
        //Should not work for String Inputs such as "six"
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int flag = 0;
        for(char c : ch )
        {
            if (!(Character.isDigit(c)))
                {
                    flag = 1;
                }
        }

        if(flag == 1)
        {
            System.out.println(("ERROR!!!"));
        }
        else
        {
            int n = Integer.parseInt(str);
            int count =0;

            while(n != 0)
            {
                n = n & (n-1); //Also used to Remove the last set bit in binary number rom left
                count++;
            }

            System.out.println(count);
        }

    }

}
