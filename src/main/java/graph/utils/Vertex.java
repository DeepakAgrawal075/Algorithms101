package graph.utils;

import java.util.LinkedList;
import java.util.List;

public class Vertex {
    private Integer data;
    private boolean visited;

    private List<Vertex> neighbours = new LinkedList<>();

    public Vertex(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex> neighbours) {
        this.neighbours = neighbours;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                ", visited=" + visited +
                '}';
    }

    public static void reset(Vertex vertex){
        vertex.setVisited(false);
    }
}
