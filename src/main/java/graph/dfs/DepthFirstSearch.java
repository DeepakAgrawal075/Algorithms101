package graph.dfs;

import graph.utils.Vertex;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class DepthFirstSearch {
    private Vertex startVertex;

    public DepthFirstSearch(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    /**
     * Insert all the elements into the stack, and then handle the
     * head of the stack which is the last node inserted.
     *
     * To make the iterative DFS yield the same result as the recursive one,
     * you need to add the elements to the stack in reverse order.
     */
    public void traverse(){
        Deque<Vertex> stack = new LinkedList<>();
        stack.push(startVertex);
        while(!stack.isEmpty()){
            Vertex current = stack.pop();
            if(!current.isVisited()){
                current.setVisited(true);
                System.out.println(current);
                Collections.reverse(current.getNeighbours());
                current.getNeighbours().forEach(stack::push);
            }
        }
    }

    /**
     * Handle each node when you see it, thus the first
     * node you handle is the first child.
     * @param vertex
     */
    public void traverseRecursively(Vertex vertex){
        vertex.setVisited(true);
        System.out.println(vertex);
        vertex.getNeighbours().forEach(neighbour -> {
            if(!neighbour.isVisited()){
                traverseRecursively(neighbour);
            }
        });
    }
    public void traverseRecursivelyStream(Vertex vertex){
        vertex.setVisited(true);
        System.out.println(vertex);
        vertex.getNeighbours().stream()
                .filter(neighbour -> !neighbour.isVisited())
                .forEach(this::traverseRecursivelyStream);
    }

}
