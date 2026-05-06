public class RGB {

    private double r;
    private double g;
    private double b;

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
}
