package childs;
import parents.Person;

public class Programmer extends Person{
   private String technology;

   public Programmer() {
      super();
   }

   public Programmer(String name, String address, String technology) {
      super(name, address);
      this.technology = technology;
   }

   void hacking() {
      System.out.println("I can hacking a website");
   }

   public void coding() {
      System.out.println("I can create a application using technology: " + technology + ".");
   }

   public void greeting() {
      System.out.println("Hello my name is " + getName() + ".");
      System.out.println("I, come from " + getAddress() + ".");
      System.out.println("My job is a " + technology + " programmer.");
   }

   public String getTechnology() {
      return this.technology;
   }

   public void setTechnology(String technology) {
      this.technology = technology;
   }
}
