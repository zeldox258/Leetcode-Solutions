
class Solution {
    public java.util.List<java.util.List<Integer>> verticalTraversal(TreeNode root) {
        java.util.List<int[]> nodes=new java.util.ArrayList<>(); dfs(root,0,0,nodes);
        nodes.sort((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]!=b[1]?a[1]-b[1]:a[2]-b[2]);
        java.util.List<java.util.List<Integer>> res=new java.util.ArrayList<>(); int prev=Integer.MIN_VALUE;
        for(int[]n:nodes){if(n[0]!=prev){res.add(new java.util.ArrayList<>());prev=n[0];}res.get(res.size()-1).add(n[2]);}
        return res;
    }
    void dfs(TreeNode node,int col,int row,java.util.List<int[]> nodes){if(node==null)return;nodes.add(new int[]{col,row,node.val});dfs(node.left,col-1,row+1,nodes);dfs(node.right,col+1,row+1,nodes);}
}
