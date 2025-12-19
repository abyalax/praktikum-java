package vars.graph.base;

import vars.array.Arrays;

public class Graph<T> {
    private Arrays<Vertex<T>> vertices;

    public Graph() {
        this.vertices = new Arrays<>();
    }

    public Arrays<Vertex<T>> getVertices() {
        return vertices;
    }

    public void addVertex(Vertex<T> vertex) {
        vertices.add(vertex);
    }

    public void addEdge(Vertex<T> source, Vertex<T> target) {
        source.adjacencies.add(new Edge<>(target));
    }

    public void removeEdge(Vertex<T> source, Vertex<T> target) {
        source.adjacencies.removeIf(edge -> edge.target.equals(target));
    }

    public void removeVertex(Vertex<T> vertex) {
        vertices.remove(vertex);
        for (Vertex<T> v : vertices) {
            v.adjacencies.removeIf(edge -> edge.target.equals(vertex));
        }
    }

    public void printGraph() {
        System.out.println("Graph vertices and their edges:");
        for (Vertex<T> vertex : this.getVertices()) {
            System.out.print("Vertex " + vertex.data + " connected to: ");
            for (Edge<T> edge : vertex.adjacencies) {
                System.out.print(edge.target.data + " ");
            }
            System.out.println();
        }
    }

}