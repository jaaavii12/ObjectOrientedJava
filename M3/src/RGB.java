public class RGB {

    private double red;
    private double green;
    private double blue;
    final static public int MIN_RANGE = 0;
    final static public int MAX_RANGE = 1;

    // Constructor
    public RGB(double r0, double g0, double b0) {
        this.red = r0;
        this.green = g0;
        this.blue = b0;
    }

    // Default constructor: black
    public RGB() {
        this(0, 0, 0);
    }

    // Set the color using RGB values
    public void set(double r0, double g0, double b0) {
        this.red = r0;
        this.green = g0;
        this.blue = b0;
    }

    // Set the color using a single value (grey)
    public void set(double grey) {
        set(grey, grey, grey);
    }

    // Display the color
    public void display() {
        System.out.println("[" + red + " " + green + " " + blue + "]");
    }

    // Compute grayscale level
    public double greyLevel() {
        return (red + green + blue) / 3.0;
    }

    // Turn the color to grey
    public void turnToGrey() {
        double grey = greyLevel();
        this.red = grey;
        this.green = grey;
        this.blue = grey;
    }

    // Check if two positions are equal
    public boolean equals(RGB colour) {
        if (colour == null)
        return false;
        if (colour == this) // same object referenced?
        return true;
        // different objects, same content?
        return this.red == colour.red && this.green == colour.green && this.blue == colour.blue;
    }

    // Bounded
    public boolean hasValuesInRange() {
        return (this.red >= MIN_RANGE && this.red <= MAX_RANGE) && (this.green >= MIN_RANGE && this.green <= MAX_RANGE) && (this.blue >= MIN_RANGE && this.blue <= MAX_RANGE);
    }

    // Check if a value is in range
    public boolean isValueInRange(double value) {
        return value >= MIN_RANGE && value <= MAX_RANGE;
    }
}