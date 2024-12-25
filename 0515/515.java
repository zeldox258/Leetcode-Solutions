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
    Map<Integer , Integer> map = new HashMap<>();
    int depth = 0;
    public List<Integer> largestValues(TreeNode root) {
        check(root,0);
        List<Integer> result = new ArrayList<>();
        for(int i = 1;i<=depth;i++){
            result.add(map.get(i));
        }

        return result;

    }
    void check(TreeNode root , int d){
        if(root == null) return;
        d++;
        if(!map.containsKey(d))map.put(d,root.val);
        else if(map.containsKey(d) && map.get(d) < root.val) map.put(d,root.val);
        depth = d > depth ? d:depth;
        check(root.left,d);
        check(root.right,d);
    }
}