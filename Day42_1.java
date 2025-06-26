import java.util.*;

public class Day42_1 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode buildTree(List<String> nodes) {
        if (nodes.isEmpty() || nodes.get(0).equals("null")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(nodes.get(0)));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < nodes.size()) {
            TreeNode current = queue.poll();
            if (i < nodes.size() && !nodes.get(i).equals("null")) {
                current.left = new TreeNode(Integer.parseInt(nodes.get(i)));
                queue.add(current.left);
            }
            i++;
            if (i < nodes.size() && !nodes.get(i).equals("null")) {
                current.right = new TreeNode(Integer.parseInt(nodes.get(i)));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = getDepth(root, true);
        int rightDepth = getDepth(root, false);
        if (leftDepth == rightDepth) return (1 << leftDepth) - 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static int getDepth(TreeNode node, boolean left) {
        int depth = 0;
        while (node != null) {
            depth++;
            node = left ? node.left : node.right;
        }
        return depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        List<String> nodeList = Arrays.asList(input);
        TreeNode root = buildTree(nodeList);
        System.out.println(countNodes(root));
    }
}