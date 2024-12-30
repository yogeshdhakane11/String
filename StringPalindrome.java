package String;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        // string input
        String str = sc.nextLine();
        System.out.println("String : "+ str);

        // reverse string
        StringBuilder sb = new StringBuilder(str);
        String reverseString = sb.reverse().toString();

        // check palindrome
        if (reverseString.equals(str)){
            System.out.println(str+" is Palindrome String");
        }else {
            System.out.println(str+" is Not Palindrome String");
        }
    }
}
