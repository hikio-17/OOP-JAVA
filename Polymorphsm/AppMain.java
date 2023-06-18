public class AppMain {
   public static void main(String[] args) {
     Person person1 = new Programmer("Fajri", "Jambi", "Javascript");

     person1.greeting();
     System.out.println(((Programmer)person1).technology);


     Person person2 = new Teacher("Hikma", "Jambi", "Matematika");

     Person person3 = new Doctor("Hikio", "Semurup", "Dentist");

     sayhello(person1);
     sayhello(person2);
     sayhello(person3);
   }

   static void sayhello(Person person) {
      String message;
      if (person instanceof Programmer) {
         Programmer programmer = (Programmer) person;
         message = "Hello, " + programmer.name + " Seorang Programmer " + programmer.technology + "."; 
      } else if (person instanceof Teacher) {
         Teacher teacher = (Teacher) person;
         message = "Hello, " + teacher.name + " Seorang Guru" + teacher.subject + ".";
      }  else if (person instanceof Doctor) {
         Doctor doctor = (Doctor) person;
         message = "Helo, " + doctor.name + " Seorang Doctor" + doctor.specialist + ".";

      } else {
         message = "Hello, " + person.name + ".";
      }

      System.out.println(message);
   }
}
