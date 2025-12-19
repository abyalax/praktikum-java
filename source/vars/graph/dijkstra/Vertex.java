package vars.graph.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    T data;
    List<Edge<T>> adjacencies;
    double distance = Double.POSITIVE_INFINITY;
    Vertex<T> previous;

    Vertex(T data) {
        this.data = data;
        this.adjacencies = new ArrayList<>();
    }
}
