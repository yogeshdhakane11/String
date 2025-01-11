package String;

import java.util.Scanner;

public class SubStringOfAnotherString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // main string
        System.out.println("Enter Main String : ");
        String mainString = sc.nextLine();
        System.out.println("MainString is : "+mainString);

        // substring
        System.out.println("Enter SubString is : ");
        String subString =sc.nextLine();
        System.out.println("Substring is : "+ subString);

        // check bool fun true if execute
        if (isSubString(mainString, subString)){
            System.out.println(subString + " : is a Substring of : " + mainString );
        }else {
            System.out.println(subString + " : is a Not Substring of : " + mainString );
        }
    }
    // substring check functions
    public static boolean isSubString(String mainString, String subString)
    {
        return mainString.contains(subString);
    }
}
