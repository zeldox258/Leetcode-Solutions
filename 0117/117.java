class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Node cur=root;
        while(cur!=null){
            Node dummy=new Node(0);Node tail=dummy;
            while(cur!=null){
                if(cur.left!=null){tail.next=cur.left;tail=tail.next;}
                if(cur.right!=null){tail.next=cur.right;tail=tail.next;}
                cur=cur.next;
            }
            cur=dummy.next;
        }
        return root;
    }
}