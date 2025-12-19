package vars.graph.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Graph<T> {
    private List<Vertex<T>> vertices;

    public Graph() {
        this.vertices = new ArrayList<>();
    }

    public void addVertex(Vertex<T> vertex) {
        vertices.add(vertex);
    }

    public void addEdge(Vertex<T> source, Vertex<T> target, double distance) {
        source.adjacencies.add(new Edge<>(target, distance));
    }

    public List<Vertex<T>> getVertices() {
        return vertices;
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

    public void dijkstra(Vertex<T> source) {

        source.distance = 0;

        PriorityQueue<Vertex<T>> queue = new PriorityQueue<>(Comparator.comparingDouble(v -> v.distance));

        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();

            for (Edge<T> edge : current.adjacencies) {
                Vertex<T> neighbor = edge.target;

                double newDistance = current.distance + edge.distance;

                if (newDistance < neighbor.distance) {
                    neighbor.distance = newDistance;
                    neighbor.previous = current;

                    queue.add(neighbor);
                }
            }
        }
    }

    public List<Vertex<T>> getShortestPath(Vertex<T> target) {
        List<Vertex<T>> path = new ArrayList<>();

        for (Vertex<T> v = target; v != null; v = v.previous) {
            path.add(v);
        }

        Collections.reverse(path);
        return path;
    }

}