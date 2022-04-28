package datastructures.graph;

import datastructures.stack.Stack;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.printGraph();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");

        graph.removeEdge("A", "B");
        graph.printGraph();
        System.out.println("----------------------------");

        Graph graphTwo = new Graph();
        graphTwo.addVertex("A");
        graphTwo.addVertex("B");
        graphTwo.addVertex("C");
        graphTwo.addVertex("D");
        graphTwo.addEdge("A", "B");
        graphTwo.addEdge("A", "C");
        graphTwo.addEdge("A", "D");
        graphTwo.addEdge("B", "D");
        graphTwo.addEdge("C", "D");

        System.out.println("After the removing");
        graphTwo.printGraph();

        graphTwo.removeVertex("D");

        System.out.println("Before the removing:");
        graphTwo.printGraph();



    }
}
