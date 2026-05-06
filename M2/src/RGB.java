public class RGB {

    private double r;
    private double g;
    private double b;
    final static public int MIN_RANGE = 0;
    final static public int MAX_RANGE = 1;

    // Constructor
    public RGB(double r0, double g0, double b0) {
        this.r = r0;
        this.g = g0;
        this.b = b0;
    }

    // Display the color
    public void display() {
        System.out.println("[" + r + " " + g + " " + b + "]");
    }

    // Compute grayscale level
    public double greyLevel() {
        return (r + g + b) / 3.0;
    }

    // Turn the color to grey
    public void turnToGrey() {
        double grey = greyLevel();
        r = grey;
        g = grey;
        b = grey;
    }

    // Check if two positions are equal
    public boolean equals(RGB colour) {
        if (colour == null)
        return false;
        if (colour == this) // same object referenced?
        return true;
        // different objects, same content?
        return this.r == colour.r && this.g == colour.g && this.b == colour.b;
    }

    // Bounded
    public boolean isBounded() {
        return (r >= MIN_RANGE && r <= MAX_RANGE) && (g >= MIN_RANGE && g <= MAX_RANGE) && (b >= MIN_RANGE && b <= MAX_RANGE);
    }
}
