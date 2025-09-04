public class Solution {
    public int AllValidTripletsThatCanReprese(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(AllValidTripletsThatCanReprese(root.left), AllValidTripletsThatCanReprese(root.right));
    }
}