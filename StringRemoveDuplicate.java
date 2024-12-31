package String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringRemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Original String : "+ str);
        // call function
        String output = removeDuplicate(str);
        System.out.println("String without duplicates: " + output);
    }
    public static String removeDuplicate(String str)
    {
        // duplicate not allow set
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        // add string LinkedHashSet each character
        for (int i = 0; i < str.length(); i++) {
            linkedHashSet.add(str.charAt(i));
        }
        // add the result StringBuilder
        StringBuilder builder = new StringBuilder();
        // Append each unique character to the StringBuilder
        for(Character ch : linkedHashSet) {
            builder.append(ch);
        }
        // return the result toString
        return builder.toString();
        }
}
