public class GraphAdjacencyMatrix {
    public static void main(String[] args) {
        int v = 3;
        int[][] graph = new int[v][v];

        graph[0][1] = 1;
        graph[1][2] = 1;

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++)
                System.out.print(graph[i][j] + " ");
            System.out.println();
        }
    }
}
