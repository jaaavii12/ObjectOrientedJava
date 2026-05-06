package geometry;

import java.util.ArrayList;

public class DisplayableMain {
    public static void main(String[] args) {
       ArrayList<Displayable> displayables = new ArrayList<>();
       displayables.add(new Position(1, 2));
       displayables.add(new Circle(3, 4, 5));
         for (Displayable d : displayables) {
             d.display();
         }
    }
}
