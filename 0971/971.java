
class Solution {
    java.util.List<Integer> res=new java.util.ArrayList<>(); int[]voyage; int idx=0; boolean ok=true;
    public java.util.List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        this.voyage=voyage; dfs(root); return ok?res:java.util.Arrays.asList(-1);
    }
    void dfs(TreeNode node){if(node==null||!ok)return;if(node.val!=voyage[idx++]){ok=false;return;}if(node.left!=null&&node.left.val!=voyage[idx]){res.add(node.val);dfs(node.right);dfs(node.left);}else{dfs(node.left);dfs(node.right);}}
}
