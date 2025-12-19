package vars.graph;

import vars.array.Arrays;

public class Graph<T> {
    Arrays<Vertex<T>> vertices;

    public Graph() {
        this.vertices = new Arrays<>();
    }

    public Arrays<Vertex<T>> getVertices() {
        return vertices;
    }

    public void addVertex(Vertex<T> data) {
        this.vertices.add(data);
    }

    public void addEdge(Vertex<T> source, Vertex<T> target) {
        source.adjacencies.add(target);
    }
}
