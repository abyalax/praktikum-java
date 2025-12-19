package vars.graph;

import vars.array.Arrays;

public class Vertex<T> {
    T data;
    Arrays<Edge<T>> adjacencies;

    Vertex(T data) {
        this.data = data;
        this.adjacencies = new Arrays<>();
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
