package graph.bfs;

import graph.utils.Vertex;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Vertex v0 = new Vertex(0);
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);

        v0.setNeighbours(Arrays.asList(v1, v5, v6));
        v1.setNeighbours(Arrays.asList(v3, v4, v5));
        v4.setNeighbours(Arrays.asList(v2, v6));
        v6.setNeighbours(Arrays.asList(v0));

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(v0);
        breadthFirstSearch.traverse();
    }
}
