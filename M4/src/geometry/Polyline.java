package geometry;
import java.util.ArrayList;

public class Polyline {
    private ArrayList<Position> edges;

    public Polyline() {
        this.edges = new ArrayList<>();
    }

    public void addEdge(Position p) {
        this.edges.add(p);
    }

    public void clearEdges() {
        this.edges.clear();
    }

    public int size() {
        return this.edges.size();
    }

    public double length() {
        double totalLength = 0.0;
        for (int i = 1; i < edges.size(); i++) { //Para i empezando en 1, mientras i sea menor que el tamaño de edges, incrementando i de uno en uno.
            totalLength += edges.get(i - 1).distance(edges.get(i - 1), edges.get(i));
        }
        return totalLength;
    }

    public String toString() {
        return "edges: " + edges + "size=" + size() + " length=" + length();
    }
}
