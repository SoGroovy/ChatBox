import java.util.Scanner;

public class Person {

  private String name;
  private int age;
  private String streetName;
  private int streetNumber;
  private String city;
  private String country;
  private long phoneNumber;
  private int zipCode;

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int newAge) {
    age = newAge;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String newStreetName) {
    streetName = newStreetName;
  }

  public int getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(int newStreetNumber) {
    streetNumber = newStreetNumber;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String newCity) {
    city = newCity;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String newCountry) {
    country = newCountry;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(long newPhoneNumber) {
    phoneNumber = newPhoneNumber;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int newZipcode) {
    zipCode = newZipcode;
  }
  public String answer(String question) {
    question = question.replaceAll("\\s+", " ");
    if(question.toLowerCase().equals("what's your name") || question.equals("name"))
      return "My name is " + name;
    if(question.toLowerCase().equals("age") || question.equals("what's your age"))
      return  "My age is " + age;
    if(question.toLowerCase().equals("street name"))
      return streetName;
    if(question.toLowerCase().equals("street number"))
      return  "The street number is: " + streetNumber;
    if(question.toLowerCase().equals("zip code"))
      return  "The zip code is :" + zipCode;
    if(question.toLowerCase().equals("country"))
      return country;
    if(question.toLowerCase().equals("phone number"))
      return "The phone number is: " + phoneNumber;
    if(question.toLowerCase().equals("city"))
      return city;
    if(question.toLowerCase().equals("what's your address"))
      return "My address is " + streetNumber + " " + streetName + ", " + city + ", " + country + ", " + zipCode;
    return "I don't understand the question";
  }

}

