
class Solution {
    Node prev=null, head=null;
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        inorder(root);
        head.left=prev; prev.right=head;
        return head;
    }
    void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        if(prev!=null){prev.right=node;node.left=prev;}else head=node;
        prev=node;
        inorder(node.right);
    }
}
