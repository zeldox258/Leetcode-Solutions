
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode node = new TreeNode(val); node.left = root; return node;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int curDepth = 1;
        while (curDepth < depth - 1) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            curDepth++;
        }
        for (TreeNode node : queue) {
            TreeNode l = new TreeNode(val), r = new TreeNode(val);
            l.left = node.left; r.right = node.right;
            node.left = l; node.right = r;
        }
        return root;
    }
}
