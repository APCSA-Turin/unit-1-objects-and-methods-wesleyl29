import java.util.Scanner;

public class RunnerThing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = myScanner.nextLine();
        int points = 0;
        int wordCount=0;
        while (points < 50){
            System.out.print("Enter next word: ");
            String word2 = myScanner.nextLine();
            if (word2.compareTo(word1)>0){
                points+=2;
                System.out.println("+2 points: current word alphebetically after; SCORE: "+points);
            } else {
                if (word2.compareTo(word1)<0){
                    points-=5;
                    System.out.println("-5 points: current word alphebetically before; SCORE: "+points);
                } else {
                    points-=10;
                    System.out.println("-10 points: current word equals previous word; SCORE: "+points);
                }
            }
            String jib = word2.substring(0, 2);
            String bij = word1.substring((word1.length()-2));
            if (jib.equals(bij)){
                points+=5;
                System.out.println("+5 points: last 2 letters of previous match first 2 letters of current; SCORE: "+points);
            }
            if (word2.indexOf(word1.substring(0,1))!=-1){
                points+=3;
                System.out.println("+3 points: first letter of previous is found in current; SCORE: "+points);
            }
            wordCount+=1;
            word1=word2;
        }
        System.out.println("You win! It toom you "+wordCount+" words!");
    }
}
