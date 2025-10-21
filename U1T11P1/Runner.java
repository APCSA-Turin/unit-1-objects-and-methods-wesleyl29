package U1T11P1;

import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = myScanner.nextLine();
        System.out.print("Enter second string: ");
        String string2 = myScanner.nextLine();
        if (string1.length()<string2.length()){
            System.out.println(string2 + " is longer");
        } else {
            if (string1.length()>string2.length()){
                System.out.println(string1 + " is longer");
            } else {
                System.out.println("Both strings have the same length");
            }
        }
        System.out.println("First half: "+string1.substring(0, (string1.length()/2)));
        System.out.println("Second half: "+string1.substring((string1.length()/2), string1.length()));
        System.out.println("First half: "+string2.substring(0, (string2.length()/2)));
        System.out.println("Second half: "+string2.substring((string2.length()/2), string2.length()));
        if ((string1.indexOf(string2))!=-1){
            System.out.println(string2 + " is found at index " + string1.indexOf(string2));
        } else {
            System.out.println(string2 + " is NOT found in " + string1);
        }
    }
}
