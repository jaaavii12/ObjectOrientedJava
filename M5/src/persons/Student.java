package persons;

public class Student extends Person {
    private String promo;

    public Student(String name, int age, String promo) {
        super(name, age);
        this.promo = promo;
    }

    public String getPromo() {
        return promo;
    }

    @Override
    public String toString() {
        return super.toString() + " - Promo: " + this.getPromo();
    }
    
}
