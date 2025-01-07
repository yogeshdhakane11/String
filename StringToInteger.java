package String;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert to integer : ");

        String str = sc.nextLine();
        System.out.println("String : "+str);
        try
        {
            int num = Integer.parseInt(str);
            System.out.println("The converted integer is: " + num);
        }catch (NumberFormatException e)
        {
            System.out.println("Error: The input string is not a valid integer.");
        }
    }
}

