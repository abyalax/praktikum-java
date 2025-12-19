package vars.graph.base;

public class Edge<T> {
    Vertex<T> target;

    Edge(Vertex<T> target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return target.data.toString();
    }
}