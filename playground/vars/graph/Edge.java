package vars.graph;

public class Edge<T> {
    private Vertex<T> target;

    Edge(Vertex<T> target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return target.data.toString();
    }
}