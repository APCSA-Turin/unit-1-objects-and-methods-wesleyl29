public class HelloWorld {
   // no instance variables

   public HelloWorld() { }  // empty constructor body

   public void saySomething() {
       System.out.println("A");
       saySomething2("B");
       System.out.println("C");
   }

   public void rainSucks(String blah) {
       System.out.println("D");
       System.out.println(blah);
       System.out.println("E");
   }

   public void saySomething2(String str) {
       System.out.println("F");
       System.out.println(str);
       rainSucks(str);
       System.out.println("G");
   }
}