class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        java.util.Map<Node,Node> map=new java.util.HashMap<>();
        Node cur=head;
        while(cur!=null){map.put(cur,new Node(cur.val));cur=cur.next;}
        cur=head;
        while(cur!=null){map.get(cur).next=map.get(cur.next);map.get(cur).random=map.get(cur.random);cur=cur.next;}
        return map.get(head);
    }
}