import java.util.*;

public class hamilton_path {

    private int v;
    private List<Integer>[] adj;

    // Constructor for hamilton_path

    public hamilton_path(int v) {
        this.v = v;
        adj = new ArrayList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public boolean findHamiltonPath() {
        int[] path = new int[v];
        Arrays.fill(path, -1);
        boolean[] visited = new boolean[v];

        path[0] = 0;
        visited[0] = true;

        if(findHamiltonPath(1, path, visited)) {
            System.out.println("Hamilton Path : " + Arrays.toString(path));
            return true;
        } else {
            System.out.println("No Hamilton path exists");
            return false;
        }
    }

    private boolean findHamiltonPath(int pos, int[] path, boolean[] visited) {
        if(pos == v){
            return true;
        }

        for(int neighbor : adj[path[pos-1]]) {
            if(!visited[neighbor]) {
                path[pos] = neighbor;
                visited[neighbor] = true;

                if(findHamiltonPath(pos + 1, path, visited)){
                    return true;
                }

                path[pos] = -1;
                visited[neighbor] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        hamilton_path graph = new hamilton_path(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        graph.findHamiltonPath();
    }
}