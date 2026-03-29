package string.palindrome;

import java.util.Scanner;

public class ReverseString
{
    public String revStr_BRUTEFORCE(String s)      // Reverse A String
    {
        String result ="";

        for(int i = s.length()-1 ; i >= 0 ; i--)
        {
            result = result + s.charAt(i);
        }
        return result;
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ReverseString rs =new ReverseString(); //Since

        System.out.println("Enter a String to reverse : ");
        String s = sc.nextLine();

        s= s.trim();

        System.out.println(rs.revStr_BRUTEFORCE(s));
    }
}