/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

   public static TreeNode rightSideView(TreeNode root){
        if(root == null){return null;}
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode temp;
        int ans = root.val;
        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            int tempsum = 0;
            for(int i = 0 ; i < size ; i++){
                temp = queue.poll();
                temp.val = ans - temp.val;
                if(temp.left != null){
                    queue.add(temp.left);
                    sum += temp.left.val;
                }
                if(temp.right != null){
                    queue.add(temp.right);
                    sum += temp.right.val;
                }
                if(temp.left != null && temp.right != null){
                    int x = temp.right.val + temp.left.val;
                    temp.right.val = x;
                    temp.left.val = x;
                }
            }
            ans = sum;
        }
        return root;
    }

    public TreeNode replaceValueInTree(TreeNode root) {
        return rightSideView(root);
    }
}