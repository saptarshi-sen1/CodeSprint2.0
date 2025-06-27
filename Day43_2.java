import java.util.*;

public class Day43_2 {
    static void dfs(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> result) {
        visited[node] = true;
        result.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, result);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            line = line.replace("[", "").replace("]", "");
            List<Integer> list = new ArrayList<>();
            if (!line.isEmpty()) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    list.add(Integer.parseInt(part.trim()));
                }
            }
            adj.add(list);
        }

        boolean[] visited = new boolean[n];
        List<Integer> result = new ArrayList<>();
        dfs(0, adj, visited, result);

        for (int i = 0; i < result.size(); i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(result.get(i));
        }
    }
}