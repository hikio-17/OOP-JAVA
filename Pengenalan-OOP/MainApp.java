public class MainApp {
   public static void main(String[] args) {
      // Membuat Object menggunakan constructor default
      Person person1 = new Person();
      person1.name = "Fajri";
      person1.address = "Jambi";

      
      // Membuat dengan 1 param constructor
      Person person2 = new Person("Tio");
      person2.address = "Jambi";
      
      // Membuat dengan 2 param constructor
      Person person3 = new Person("Fajri", "Jambi");

      person1.sayHello("Padepokan 79");
      person2.sayHello("Padepokan 79");
      person3.sayHello("Padepokan 79");

      person1.sayAddress();
      person2.sayAddress();
      person3.sayAddress();
      
      System.out.println(person1.name);
      System.out.println(person1.address);
      System.out.println(person1.country);

      System.out.println(person2.name);
      System.out.println(person2.address);
      System.out.println(person3.name);
      System.out.println(person3.address);
      
   }
}