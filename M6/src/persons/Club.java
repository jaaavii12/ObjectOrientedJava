package persons;

import java.util.HashMap;

public class Club {
    private String name;
    private HashMap<String, Person> members;
    // quiero que inicialmente se pueda crear un club sin miembros, y luego ir añadiendo miembros al club
    public Club(String name) {
        this.name = name;
        this.members = new HashMap<>();
    }

    public void enroll(Person person) {
        members.put(person.getName(), person);
    }

    public double meanAge() {
        if (members.isEmpty()) {
            return 0;
        }
        int totalAge = 0;
        for (Person member : members.values()) {
            totalAge += member.getAge();
        }
        return (double) totalAge / members.size();
    }

    public void display() {
        System.out.println("Club: " + name);
        System.out.println("Members:");
        for (String name : members.keySet()) {
            System.out.println("- " + name);
        }
        System.out.println("Mean Age: " + meanAge());
    }

    @Override
    public String toString() {
        return "Club{" +
                "name=" + name +
                ", members=" + members.keySet() +
                ", meanAge=" + meanAge() +
                '}';
    }
}
