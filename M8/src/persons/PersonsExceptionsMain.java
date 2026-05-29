package persons;

public class PersonsExceptionsMain {
    public static void main(String[] args) {
        Person invalidPerson = new Person("", 30);
        System.out.println(invalidPerson);
    }
}
