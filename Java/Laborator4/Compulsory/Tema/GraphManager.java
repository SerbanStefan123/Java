package com.robot;

import org.jgrapht.Graph;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GraphManager {
    private Graph<Location, DefaultWeightedEdge> graph;
    private Random random = new Random();

    public GraphManager() {
        this.graph = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);
    }

    public void createGraph(List<Location> locations) {
        for (Location loc : locations) {
            graph.addVertex(loc);
        }

        for (Location from : locations) {
            for (Location to : locations) {
                if (!from.equals(to) && random.nextBoolean()) {
                    double time = 1 + random.nextDouble() * 10;
                    DefaultWeightedEdge edge = graph.addEdge(from, to);
                    graph.setEdgeWeight(edge, time);
                }
            }
        }
    }

    public Map<Location, Double> computeShortestPaths(Location start) {
        DijkstraShortestPath<Location, DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<>(graph);
        Map<Location, Double> shortestPaths = new HashMap<>();

        for (Location location : graph.vertexSet()) {
            if (!location.equals(start)) {
                double time = dijkstra.getPathWeight(start, location);
                shortestPaths.put(location, time == Double.POSITIVE_INFINITY ? -1 : time);
            }
        }
        return shortestPaths;
    }
}
