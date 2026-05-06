public class RGBMain {
    public static void main(String[] args) {
        
    RGB color = new RGB(0.25, 0.75, 0.5);

    System.out.println("Original color:");
    color.display();

    double grey = color.greyLevel();
    System.out.println("Grey level = " + grey);

    color.turnToGrey();

    System.out.println("After turning to grey:");
    color.display();
    }
}
