package U1T6_Return;

public class Main {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 3);
        debbie.greeting("friend!");
        debbie.weather();
        System.out.println("10 feet in meters is "+debbie.convertFeetToMeters(12));
        debbie.favoriteNumber(22);
        System.out.println("3 plus 12 plus 33 is "+debbie.addNumbers(3, 12, 33));
        debbie.favoriteGame("DMC5");
        System.out.println(debbie.leastFavoriteDay());
        System.out.println("I have "+debbie.fingers(10)+" fingers");
        debbie.pain();
        System.out.println(debbie.funFact("bears"));
        System.out.println("The amount of students in Brooklyn Tech that like food is "+debbie.amountOfPeopleWhoLikeFood(6000));
        System.out.println(debbie.goodbye());
    }
}
