import java.util.*;

public class GraphAdjacencyList {
    public static void main(String[] args) {
        int v = 3;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(2);

        System.out.println(graph);
    }
}
