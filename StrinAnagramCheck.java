package String;

import java.util.Arrays;
import java.util.Scanner;

public class StrinAnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String S1 : ");
        String S1 = sc.nextLine();

        System.out.println("Enter a String S2 : ");
        String S2 = sc.nextLine();

        System.out.println("String S1 : "+ S1 + "  String S2 : "+ S2);

        // remove space convert lowercase check anagram
        S1 = S1.replace(" ","").toLowerCase();
        S2 = S2.replace(" ","").toLowerCase();

        // string to char array convert
        char [] array1 = S1.toCharArray();
        char [] array2 = S2.toCharArray();

        // sort char array
        Arrays.sort(array1);
        Arrays.sort(array2);

        // arrays.equals check anagram same
        if (Arrays.equals(array1,array2)) {
            System.out.println("String are Anagram ");
        }else {
            System.out.println("String are Not Anagram ");
        }
    }
}
