import parents.Person;

public class AppMain {
   public static void main(String[] args) {
     Person person1 = new Person();
     person1.setName("Fajri");
     person1.setAddress("Jambi");

     System.out.println(person1.getName());
   }
}
