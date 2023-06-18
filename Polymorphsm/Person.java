public class Person {
   String name;
   String address;
   public char[] country;

   public Person(String name, String address) {
      super();
      this.name = name;
      this.address = address;
   }

   public Person(String string) {
      super();
   }

   public Person() {
   }

   void greeting() {
      System.out.println("Hello my name is " + name + ".");
      System.out.println("I, come from " + address + ".");
   }

   public void sayHello(String string) {
   }

   public char[] sayAddress() {
      return null;
   }
}