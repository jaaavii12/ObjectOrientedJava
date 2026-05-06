public class App {
    public static void main(String[] args) throws Exception {
        RGB c1 = new RGB(0.5, 0.2, 0.8);
        RGB c2 = new RGB(0.4, 0.3, 0.2);
        RGB c3 =null;
        System.out.println("Color 1:");
        c1.display();
        System.out.println("Color 2:");
        c2.display();
        System.out.println("Are the colors 1 and 2 equal? " + c1.equals(c2));
        System.out.println("Are the colors 1 and 3 equal? " + c1.equals(c3));
        c3 = c1;
        c3.display();
        System.out.println("Are the colors 1 and 3 equal? " + c1.equals(c3));
        System.out.println("Are the colors 2 and 3 equal? " + c2.equals(c3));
        System.out.println("Is color 1 bounded? " + c1.isBounded());
    }
}
