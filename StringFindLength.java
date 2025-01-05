package String;

import java.util.Scanner;

public class StringFindLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // string input
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        // print string
        System.out.println("String is : "+str);

        // length find without length() function
        int count =0;
        while (true){
            try
            {
                str.charAt(count);
                count++;
            }catch (StringIndexOutOfBoundsException e){
                break;
            }
        }
        System.out.println("String Length is : "+ count);
    }
}
