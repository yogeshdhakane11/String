package String;

import java.util.Scanner;

public class StringVowelsConstants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("String is : "+ str);

        int vowels = 0;
        int consontants = 0;

       // convert lowercase all
        str = str.toLowerCase();

        // convert the character ch variable check ch
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            }
            else if (ch>= 'a' && ch<='z')
            {
                consontants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consontants);
    }
}
