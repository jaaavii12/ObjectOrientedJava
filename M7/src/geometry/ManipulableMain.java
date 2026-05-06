package geometry;

public class ManipulableMain {
    public static void main(String[] args) {
        Position p1 = new Position(1, 2);
        Circle c1 = new Circle(3, 4, 5);
        p1.display();
        c1.display();
        p1.translate(100, 100);
        c1.translate(100, 100);
        p1.display();
        c1.display();
    }
}
