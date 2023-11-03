
class CBTInserter {
    private java.util.Queue<TreeNode> q; private TreeNode root;
    public CBTInserter(TreeNode root){this.root=root;q=new java.util.LinkedList<>();java.util.Queue<TreeNode>bfs=new java.util.LinkedList<>();bfs.offer(root);while(!bfs.isEmpty()){TreeNode n=bfs.poll();if(n.left==null||n.right==null)q.offer(n);if(n.left!=null)bfs.offer(n.left);if(n.right!=null)bfs.offer(n.right);}}
    public int insert(int val){TreeNode node=new TreeNode(val),p=q.peek();if(p.left==null)p.left=node;else{p.right=node;q.poll();}q.offer(node);return p.val;}
    public TreeNode get_root(){return root;}
}
