package vars.graph.base;

public class Main {
    public static void main(String[] args) {
        Graph<Number> graph = new Graph<>();

        Vertex<Number> v1 = new Vertex<>(1);
        Vertex<Number> v2 = new Vertex<>(2);
        Vertex<Number> v3 = new Vertex<>(3);
        Vertex<Number> v4 = new Vertex<>(4);

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);

        graph.addEdge(v1, v2);
        graph.addEdge(v1, v3);
        graph.addEdge(v2, v4);
        graph.addEdge(v3, v4);

        graph.printGraph();
        graph.removeEdge(v3, v4);
        System.out.println("remove edge: " + new Edge<>(v3) + ", " + new Edge<>(v4));
        graph.printGraph();
    }
}
