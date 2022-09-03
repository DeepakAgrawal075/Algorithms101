package graph.bfs;

import graph.utils.Vertex;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    private Vertex startVertex;

    public BreadthFirstSearch(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public void traverse() {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(startVertex);
        while (!queue.isEmpty()) {
            Vertex current = queue.poll();
            if (!current.isVisited()) {
                current.setVisited(true);
                System.out.println(current);
                queue.addAll(current.getNeighbours());
            }
        }
    }
}
