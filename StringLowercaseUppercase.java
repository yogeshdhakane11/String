package String;

import java.util.Scanner;

public class StringLowercaseUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String inputString = sc.nextLine();
        System.out.println("Original String : "+ inputString);

        // uppercase
        String uppercase = inputString.toUpperCase();
        System.out.println("Uppercase : "+ uppercase);

        // lowercase
        String lowercase = inputString.toLowerCase();
        System.out.println("Lowercase : "+ lowercase);
    }
}
