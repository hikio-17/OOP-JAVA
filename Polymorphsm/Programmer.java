public class Programmer extends Person{
   String technology;

   public Programmer() {
      //
   }

   public Programmer(String name, String address, String technology) {
      super(name, address);
      this.technology = technology;
   }

   void hacking() {
      System.out.println("I can hacking a website");
   }

   void coding() {
      System.out.println("I can create a application using technology: " + technology + ".");
   }

   @Override
   void greeting() {
      super.greeting();
      System.out.println("My job is a " + technology + " programmer.");
   }
}
