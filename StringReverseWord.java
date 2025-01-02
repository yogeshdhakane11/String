package String;

import java.util.Scanner;

public class StringReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // string input
        System.out.println("Enter a Strng : ");
        String str = sc.nextLine();

        // call function pass string
        String result = reverseWord(str);
        System.out.println("Reverse Word is : "+ result);
    }
    // reverse word method
    public static String reverseWord(String str)
    {
        // split the space using word
        String [] words = str.split(" ");

        // append words string use builder
        StringBuilder stringBuilder = new StringBuilder();

        //
        for (int i = words.length -1 ; i >= 0 ; i--) {
            stringBuilder.append(words[i]);
            // last time index is 0 not add space condton flase
            if (i!= 0)
            {
                stringBuilder.append(" ");
            }
        }
        // builder convert string and return
        return stringBuilder.toString();
    }
}
