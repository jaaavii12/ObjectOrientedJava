package lists;
import java.util.ArrayList;

public class FindMinStringMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("grape");
        list.add("orange");
        list.add("kiwi");

        String minValue = list.get(0); // Initialize minValue with the first element of the list
        for (String value : list) {
            if (value.compareTo(minValue) < 0) { //the value 0 if the argument string is equal to this string; a value less than 0 if this 
            // string is lexicographically less than the string argument; and a value greater than 0 if this string is lexicographically greater
            // than the string argument.
                minValue = value; // Update minValue if a smaller value is found
            }
    }
        System.out.println("Minimum value in the list: " + minValue);
    }
}