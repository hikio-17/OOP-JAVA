package childs;
import parents.Person;

public class Doctor extends Person {
   public String specialist;

   public Doctor() {
      super();
   }

   public Doctor(String name, String address, String specialist) {
      super(name, address);
      this.specialist = specialist;
   }

   public void surgery() {
      System.out.println("I can surgery operation Pattients");
   }

   public void greeting() {
      super.greeting();
      System.out.println("My occupation is a " + specialist + " doctor.");
   }
}
