package AlgorithmenUndDatenstrukturen.graphs;

import AlgorithmenUndDatenstrukturen.ConsoleColors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Graph {
    private final Integer[][] edges;

    public Graph(int n) {
        edges = new Integer[n][n];

        for(Integer[] row : edges) {
            Arrays.fill(row, null);
        }
    }

    public List<Integer> getNeighbours(int node) {
        node--;

        if(node < 0 || node >= edges.length) {
            throw new IllegalArgumentException("This node does not exist");
        }

        List<Integer> neighbours = new ArrayList<>();

        for(int i = 0; i<edges.length; i++) {
            if(edges[node][i] != null) {
                neighbours.add(i+1);
            }
        }

        return neighbours;
    }

    public void addEdge(int a, int b, boolean bidirectional, int weight) {
        a--;
        b--;

        if(a < 0 || a >= edges.length || b < 0 || b >= edges.length) {
            throw new IllegalArgumentException("Invalid parameters, at least one node does not exist");
        }

        edges[a][b] = weight;
        if(bidirectional) {
            edges[b][a] = weight;
        }
    }

    public void addEdge(int a, int b, boolean bidirectional) {
        addEdge(a, b, bidirectional, 1);
    }

    public void deleteEdge(int a, int b) {
        a--;
        b--;

        if(a < 0 || a >= edges.length || b < 0 || b >= edges.length) {
            throw new IllegalArgumentException("Invalid parameters, at least one node does not exist");
        }

        edges[a][b] = null;
        edges[b][a] = null;
    }

    public int getNumbersOfVertices() {
        return edges.length;
    }

    public int getNumberOfEdges() {
        int counter = 0;
        for(Integer[] edge : edges) {
            for(Integer node : edge) {
                if(node != null) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public void bfs(int start) {
        //ArrayList<Integer> q = new ArrayList<>();
        Queue<Integer> q = new ConcurrentLinkedQueue<>();
        boolean[] visited = new boolean[edges.length];
        int current;

        q.add(start);

        while(!q.isEmpty()) {
            //current = q.remove(0);
            current = q.remove();
            visited[current-1] = true;
            System.out.println("Besuche Knoten " + current);
            for(int neighbour : getNeighbours(current)) {
                if(!visited[neighbour-1]) {
                    q.add(neighbour);
                }
            }
        }

        System.out.println("Die Breitensuche ist abgeschlossen");
    }

    public void printAdjacencyMatrix() {
        System.out.print(ConsoleColors.WHITE_BOLD_BRIGHT+ConsoleColors.BLACK_BACKGROUND_BRIGHT+" X "+ConsoleColors.WHITE_BACKGROUND_BRIGHT + ConsoleColors.BLACK_BOLD_BRIGHT + " ");
        int l, paddingAmout;
        String paddingLeft, paddingRight;

        for(int i=1; i<=edges.length; i++) {
            paddingAmout = getMaxLengthInColumn(i-1) - String.valueOf(i).length();
            paddingLeft = new String(new char[paddingAmout / 2]).replace("\0", " ");
            paddingRight = new String(new char[paddingAmout- paddingLeft.length()]).replace("\0", " ");

            System.out.print(" " + paddingLeft + i + paddingRight + "  ");
        }
        System.out.println(ConsoleColors.RESET);

        int counter = 1;
        for(Integer[] edge : edges) {
            System.out.print(ConsoleColors.WHITE_BACKGROUND_BRIGHT + ConsoleColors.BLACK_BOLD_BRIGHT + " " + counter + " " + ConsoleColors.RESET+" ");
            counter++;

            int column = 0;

            for(Integer node : edge) {
                String nodeString;
                if(node == null) {
                    nodeString = "0";
                } else {
                    nodeString = ConsoleColors.RED + node + ConsoleColors.RESET;
                }
                l = node == null ? 1 : String.valueOf(node).length();
                paddingAmout = getMaxLengthInColumn(column) - l;
                paddingLeft = new String(new char[paddingAmout / 2]).replace("\0", " ");
                paddingRight = new String(new char[paddingAmout- paddingLeft.length()]).replace("\0", " ");
                System.out.print("[" + paddingLeft + nodeString + paddingRight + "] ");
                column++;
            }
            System.out.println();
        }
    }

    public int getMaxLengthInColumn(int column) {
        int max = 0;
        int l;
        for(int i=0; i< edges.length; i++) {
            if(edges[i][column] !=  null && edges[i][column] > max) {
                max = edges[i][column];
            }
        }

        if(column > max) {
            max = column;
        }

        return String.valueOf(max).length();
    }
}
