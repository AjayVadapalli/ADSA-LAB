import java.util.*;

class BFS_AM {
    static void bfs(int[][] adj, int start) {
        boolean[] visited = new boolean[5];  // Array to track visited nodes
        List<Integer> q = new ArrayList<>(); // Queue to store nodes to visit next
        q.add(start); // Start with the start node
        visited[start] = true; // Mark the start node as visited

        int vis; // Variable to store the node being visited
        while (!q.isEmpty()) {  // Keep visiting nodes until the queue is empty
            vis = q.get(0);  // Get the first node in the queue (FIFO order)
            System.out.print(vis + " ");  // Print the visited node
            q.remove(0);  // Remove the node from the queue

            // Check all nodes for adjacency to the current node
            for (int i = 0; i < 5; i++) {
                // If there's an edge and the node i is not visited, add it to the queue
                if (adj[vis][i] == 1 && !visited[i]) {
                    q.add(i);  // Add node i to the queue
                    visited[i] = true;  // Mark node i as visited
                }
            }
        }
    }

    public static void main(String[] args) {
        int adj[][] = { 
            {0, 1, 1, 0, 0}, 
            {1, 0, 1, 0, 0}, 
            {0, 1, 0, 1, 1},
            {0, 0, 1, 0, 0}, 
            {0, 0, 1, 0, 0} 
        };
        bfs(adj, 0);  // Perform BFS starting from node 0
    }
}
