package vars.graph.dijkstra;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRAKTIKUM STRUKTUR DATA ===\n");

        // ============================================================
        // GRAPH - Dijkstra Implementation
        // ============================================================
        Graph<Kota> graph = new Graph<>();

        Vertex<Kota> jakarta = new Vertex<>(new Kota("Jakarta"));
        Vertex<Kota> madiun = new Vertex<>(new Kota("Madiun"));
        Vertex<Kota> lamongan = new Vertex<>(new Kota("Lamongan"));
        Vertex<Kota> bandung = new Vertex<>(new Kota("Bandung"));

        graph.addVertex(jakarta);
        graph.addVertex(madiun);
        graph.addVertex(lamongan);
        graph.addVertex(bandung);

        graph.addEdge(jakarta, madiun, 2.5);
        graph.addEdge(jakarta, lamongan, 3.6);
        graph.addEdge(madiun, bandung, 4.1);
        graph.addEdge(lamongan, bandung, 1.2);

        System.out.println("Graph vertices and their edges:");
        for (Vertex<Kota> vertex : graph.getVertices()) {
            System.out.print("Vertex " + vertex.data + " connected to: ");
            for (Edge<Kota> edge : vertex.adjacencies) {
                System.out.print(edge.target.data + ", ");
            }
            System.out.println();
        }

        graph.dijkstra(jakarta);

        List<Vertex<Kota>> path = graph.getShortestPath(bandung);

        System.out.println();
        System.out.print("Shortest Path: ");
        for (Vertex<Kota> v : path) {
            if (v.data != null) {
                System.out.print(" -> ");
                System.out.print(v.data);
            }
        }

        System.out.println("\nTotal Distance: " + bandung.distance);
    }
}
