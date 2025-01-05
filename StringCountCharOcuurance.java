package String;

import java.util.Scanner;

public class StringCountCharOcuurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // string input
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        // print
        System.out.println("String is : "+ str);

        // char occurrence
        int count =0;
        char ch = 'a';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("Character : "+ ch + " is appears in : "+ count +" time String");
    }
}
