package bit_manipulation;

import java.util.*;

public class reverseBits {

    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Integer to Print its Equivalent Binary Reverse :");

        String input = sc.nextLine();

        try{
                int n = Integer.parseInt(input);
                int result = 0;

                for(int i = 0 ; i<32 ; i++) //Since Int = 32 bits long
                {
                    int lastBit = n & 1; //Get the last most bit of number
                    result = result << 1; //make space for insertion
                    result = result | lastBit ; //inserted that bit
                    n = n >> 1;
                }

                System.out.println("Bit Reversed Number : " + result);

        }
        catch(NumberFormatException e)
        {
            System.out.println("Error in Input!!!!");
        }

    }
}
