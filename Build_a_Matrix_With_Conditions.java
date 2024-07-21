import java.util.*;

class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        // Get the topological order for rows and columns
        int[] rowOrder = topologicalSort(k, rowConditions);
        int[] colOrder = topologicalSort(k, colConditions);

        // If any order is null, it means there's a cycle and we can't construct the matrix
        if (rowOrder == null || colOrder == null) {
            return new int[0][0];
        }

        // Initialize the result matrix
        int[][] matrix = new int[k][k];
        
        // Create position arrays to store the position of each number in the row and column order
        int[] rowPos = new int[k + 1];
        int[] colPos = new int[k + 1];

        // Fill position arrays with the index positions from the topological order
        for (int i = 0; i < k; i++) {
            rowPos[rowOrder[i]] = i;
            colPos[colOrder[i]] = i;
        }

        // Place each number in the matrix according to the topological order positions
        for (int i = 1; i <= k; i++) {
            matrix[rowPos[i]][colPos[i]] = i;
        }

        return matrix;
    }

    private int[] topologicalSort(int k, int[][] conditions) {
        // Create an adjacency list for the graph
        List<Integer>[] graph = new ArrayList[k + 1];
        // Initialize indegree array to count the number of incoming edges for each node
        int[] indegree = new int[k + 1];

        // Initialize the adjacency list
        for (int i = 0; i <= k; i++) {
            graph[i] = new ArrayList<>();
        }

        // Build the graph from the conditions
        for (int[] condition : conditions) {
            int u = condition[0];
            int v = condition[1];
            graph[u].add(v);
            indegree[v]++;
        }

        // Initialize a queue to perform topological sorting
        Queue<Integer> queue = new LinkedList<>();
        // Add all nodes with no incoming edges to the queue
        for (int i = 1; i <= k; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // Array to store the topological order
        int[] order = new int[k];
        int index = 0;

        // Perform BFS to get the topological order
        while (!queue.isEmpty()) {
            int node = queue.poll();
            order[index++] = node;

            // Reduce the indegree of the neighbors and add them to the queue if their indegree becomes 0
            for (int neighbor : graph[node]) {
                if (--indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // If we have processed all nodes, return the order; otherwise, return null (indicating a cycle)
        return index == k ? order : null;
    }
}
