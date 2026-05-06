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
        System.out.println("(" + this.x + ", " + this.y + ")");
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

    // Distance to another position
    public double distance(Position p1, Position p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Check if two positions are equal
    public boolean equals(Position other) { 
        if (other == null)
            return false;
        if (other == this) // same object referenced?
            return true;
        // different objects, same content?
        return this.x == other.x && this.y == other.y;
    }

    // Bidirectional translation of this position by (dx, dy)
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
}