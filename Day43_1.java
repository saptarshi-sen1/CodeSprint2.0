import java.util.*;

public class Day43_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            List<Integer> neighbors = new ArrayList<>();
            if (!line.isEmpty()) {
                for (String s : line.split("\\s+")) {
                    neighbors.add(Integer.parseInt(s));
                }
            }
            adj.add(neighbors);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        q.add(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            result.add(curr);
            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) System.out.print(" ");
        }
    }
}