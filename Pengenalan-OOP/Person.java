public class Person {
   // Field/Attribute
   public String name;
   public String address;
   final String country = "Indonesia";

   // Constructor default
   Person() {
      super();
   }

   // Constructor with  one param
   Person(String name) {
      this.name = name;
   }

   // Constructor with two param
   Person(String name, String address) {
      // using this for conflict variable shadowing
      this.name = name;
      this.address = address;
   }

   // Method/function
   void sayHello(String name) {
      System.out.println("Hello " + this.name + ", Myname is " + name + ".");
   }

   String sayAddress() {
      return "I, come from " + this.address + ".";
   }
}