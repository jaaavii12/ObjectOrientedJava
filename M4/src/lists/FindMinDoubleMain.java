package lists;
import java.util.ArrayList;

public class FindMinDoubleMain {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(6.0);
        list.add(3.0);
        list.add(14.0);
        list.add(8.0);
        list.add(6.0);
        list.add(9.0);

        double minValue = list.get(0); // Initialize minValue with the first element of the list
        for (double value : list) {
            if (value < minValue) {
                minValue = value; // Update minValue if a smaller value is found
            }
        }
        System.out.println("Minimum value in the list: " + minValue);
    }
}
