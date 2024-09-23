
import java.util.*;
class Codec {
    public TreeNode encode(Node root) {
        if(root==null) return null;
        TreeNode treeNode=new TreeNode(root.val);
        if(!root.children.isEmpty()){treeNode.left=encode(root.children.get(0));}
        TreeNode cur=treeNode.left;
        for(int i=1;i<root.children.size();i++){cur.right=encode(root.children.get(i));cur=cur.right;}
        return treeNode;
    }
    public Node decode(TreeNode root) {
        if(root==null) return null;
        Node node=new Node(root.val,new ArrayList<>());
        TreeNode cur=root.left;
        while(cur!=null){node.children.add(decode(cur));cur=cur.right;}
        return node;
    }
}
