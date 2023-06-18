public class AppMain {
   public static void main(String[] args) {
      Person person = new Person();
      person.name = "Hendra";
      person.address = "Garut";

      Teacher teacher1 = new Teacher();
      teacher1.name = "Budi";
      teacher1.address = "Bandung";
      teacher1.subject = "Matematika";

      Doctor doctor1 = new Doctor();
      doctor1.name = "Elis";
      doctor1.address = "Jakarta";
      doctor1.specialist = "Dentis";

      Programmer programmer1 = new Programmer();
      programmer1.name = "Fajri";
      programmer1.address = "Jambi";
      programmer1.technology = "Javascript";

      person.greeting();
      teacher1.greeting();
      doctor1.greeting();
      programmer1.greeting();
   }
}
