class Solution {
    public int solve2505(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);int depth=0;
        while(!q.isEmpty()){
            int sz=q.size();depth++;
            for(int i=0;i<sz;i++){
                TreeNode n=q.poll();
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
        }
        return depth;
    }
}