package persons;

public class PersonsMain {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Asterix", 32);
        System.out.println(person.getClass() + ", " + Integer.toHexString(person.hashCode()) + " ---> " + person.toString());
        Object object = new Object();
        System.out.println(person.hashCode());
        System.out.println(person.toString());
        System.out.println(object.toString());
        person.display();
        System.out.println(person);
    }
    
}
