package geometry;
import java.util.ArrayList;

public class PositionListMain {
    public static void main(String[] args) {
        ArrayList<Position> listOfPos = new ArrayList<>();
        listOfPos.add(new Position(1, 2));
        listOfPos.add(new Position(3, 4));
        listOfPos.add(new Position(5, 6));

        System.out.println("Positions in the list:");
        for (Position p : listOfPos) {
            p.display();
        }

        System.out.println(listOfPos); //Java imprime con toString() la representación por defecto del objeto: nombreClase@hashcode.
        //si añado un metodo toString() a la clase Position, podré imprimir una representación personalizada de los objetos Position en la lista.
    }
}
