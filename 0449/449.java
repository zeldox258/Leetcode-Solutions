
class Codec {
    public String serialize(TreeNode root) {
        if(root==null) return "#";
        return root.val+","+serialize(root.left)+","+serialize(root.right);
    }
    int idx=0;
    public TreeNode deserialize(String data) {
        String[] nodes=data.split(","); idx=0; return des(nodes);
    }
    TreeNode des(String[] nodes){
        if(nodes[idx].equals("#")){idx++;return null;}
        TreeNode node=new TreeNode(Integer.parseInt(nodes[idx++]));
        node.left=des(nodes); node.right=des(nodes); return node;
    }
}
