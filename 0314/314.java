
import java.util.*;
class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> cols = new LinkedList<>();
        q.offer(root); cols.offer(0);
        while (!q.isEmpty()) {
            TreeNode node = q.poll(); int col = cols.poll();
            map.computeIfAbsent(col, k->new ArrayList<>()).add(node.val);
            if (node.left!=null) { q.offer(node.left); cols.offer(col-1); }
            if (node.right!=null) { q.offer(node.right); cols.offer(col+1); }
        }
        res.addAll(map.values());
        return res;
    }
}
