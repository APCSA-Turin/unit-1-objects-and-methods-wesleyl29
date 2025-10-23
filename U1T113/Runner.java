package U1T113;

public class Runner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        System.out.println(methods.longerThan("null", 6));
        System.out.println(methods.funnyString("trickle", 5));
        System.out.println(methods.halvesReversed("oilfol"));
        System.out.println(methods.pigLatin("polop"));
        System.out.println(methods.removeCharacter("Hi guys", 4));
        System.out.println(methods.insertAt("ghost", "BOOST!", "s"));
        System.out.println(methods.endUp("stringler", 4));
        System.out.println(methods.yellOrWhisper("Hello man"));
    }
}
