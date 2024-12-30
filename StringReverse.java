package String;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        // input string
        String str = sc.nextLine();
        System.out.println("Original String : "+ str);

        // reverse string
        StringBuilder sb = new StringBuilder(str);
        String reverseString = sb.reverse().toString();

        System.out.println("Reverse String : "+ reverseString);
    }
}
