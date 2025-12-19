package vars.graph.dijkstra;

public class Edge<T> {
    Vertex<T> target;
    double distance;

    Edge(Vertex<T> target, double distance) {
        this.target = target;
        this.distance = distance;
    }
}