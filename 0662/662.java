
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int res = 0;
        Queue<long[]> q = new LinkedList<>();
        q.offer(new long[]{root.val, 0, 0});
        // use node + position
        Queue<Object[]> queue = new LinkedList<>();
        queue.offer(new Object[]{root, 0L});
        while (!queue.isEmpty()) {
            int size = queue.size();
            long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                Object[] cur = queue.poll();
                TreeNode node = (TreeNode) cur[0];
                long pos = (long) cur[1];
                min = Math.min(min, pos);
                max = Math.max(max, pos);
                if (node.left != null) queue.offer(new Object[]{node.left, 2 * pos});
                if (node.right != null) queue.offer(new Object[]{node.right, 2 * pos + 1});
            }
            res = (int) Math.max(res, max - min + 1);
        }
        return res;
    }
}
