import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Person person = new Person();
    person.setName("Joey");
    person.setAge(21);
    person.setStreetName("Rawls Circle");
    person.setStreetNumber(420);
    person.setCity("Irving");
    person.setCountry("USA");
    person.setZipCode(75061);
    person.setPhoneNumber(9725793033L);

    while (true) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("What is your question?");
      String question = keyboard.nextLine();
      if (question.equals("exit")) {
        break;
      }
      System.out.println(person.answer(question));
    }
  }
}

