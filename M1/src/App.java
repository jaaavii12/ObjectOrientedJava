public class App {

    public static void main(String[] args) {

    Position p1 = new Position();
    p1.display();

    Position p2 = new Position(3, 4);
    p2.display();

    Position p3 = new Position(p2);
    p3.display();

    p1.moveTo(5, 6);
    p1.display();

    p3.moveTo(p1);
    p3.display();

    System.out.println("Distance of p2 to origin: " + p2.distanceToOrigin());
}
}
