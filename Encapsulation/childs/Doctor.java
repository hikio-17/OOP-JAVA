package childs;
import parents.Person;

public class Doctor extends Person {
   private String specialist;

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
      System.out.println("Hello my name is " + getName() + ".");
      System.out.println("I, come from " + getAddress() + ".");
      System.out.println("My occupation is a " + specialist + " doctor.");
   }

   public String getSpecialist() {
      return this.specialist;
   }

   public void setSpecialist(String specialist) {
      this.specialist = specialist;
   }
}
