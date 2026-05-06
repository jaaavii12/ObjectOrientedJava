public class Position {

    private double x;
    private double y;

    // Constructor: default (0,0)
    public Position() {
        this(0, 0);
    }

    // Constructor with coordinates
    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Position(Position p0) {
        this(p0.x, p0.y);
    }

    // Display position
    public void display() {
        System.out.println("Position: (" + this.x + ", " + this.y + ")");
    }

    // Move using coordinates
    public void moveTo(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    // Overloaded moveTo using another Position
    public void moveTo(Position other) {
        moveTo(other.x, other.y);
    }

    // Distance to origin
    public double distanceToOrigin() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}