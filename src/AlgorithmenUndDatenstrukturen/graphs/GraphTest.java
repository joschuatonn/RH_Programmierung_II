package AlgorithmenUndDatenstrukturen.graphs;

public class GraphTest {
    public static void main(String[] args) {
        Graph g = new Graph(9);

        g.printAdjacencyMatrix();

        System.out.println(g.getNeighbours(1));
        //System.out.println(g.getNeighbours(100));
        g.addEdge(2, 3, true, 14000);
        g.addEdge(2, 6, false);
        g.addEdge(2, 9, true);
        g.printAdjacencyMatrix();
        System.out.println(g.getNeighbours(2));

        //g.bfs(3);
        g.bfsWithColors(3);
    }
}
