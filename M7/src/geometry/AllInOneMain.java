package geometry;

public class AllInOneMain {
    public static void main(String[] args) {
        AllInOne p1 = new Position(1, 2);
        AllInOne c1 = new Circle(3, 4, 5);
        p1.display();
        c1.display();
        p1.translate(100, 100);
        c1.translate(100, 100);
        p1.display();
        c1.display();
    }
}
