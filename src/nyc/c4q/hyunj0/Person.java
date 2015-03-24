package nyc.c4q.hyunj0;

/**
 * Created by c4q-sarahkim on 3/23/15.
 */

public class Person {

    public static void main(String[] args) {
        Person allison = new Person("Allison");
        Person sarah = new Person("Sarah");

        allison.setCity("Wilmington");
        sarah.setCity("wilmington");

        boolean answer = allison.checkSameCity (allison, sarah);

        System.out.println(answer);

        Person abcsParent = new Person("Abc's Parent");
        abcsParent.setPhoneNumber("212-555-9999");
        abcsParent.setCity("New York");


        System.out.println(registerChild(abcsParent));
    }





    private String name;
    private String phoneNumber;
    private String city;

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }

    /*Jeff recommended this method to simplify the method right below this one,

    public boolean livesInSameCity(Person candidate){

        if (city.equalsIgnoreCase(candidate.getCity())) {
            return true;
        } else {
            return false;
        }
    }
 */

    public boolean checkSameCity (Person personOne, Person personTwo) {
        if (personOne.getCity().equalsIgnoreCase(personTwo.getCity())) {
            return true;
        } else {
            return false;
        }
    }

    public Person registerChild (Person parent) {
        Person child = new Person("Abc");
        String parentPhone = parent.getPhoneNumber();
        child.setPhoneNumber(parentPhone);
        String parentCity = parent.getCity();
        child.setCity(parentCity);
        return child;
    }







    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

