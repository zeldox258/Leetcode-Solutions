
import java.util.*;
class Codec {
    public String serialize(Node root) {
        if(root==null) return "";
        StringBuilder sb=new StringBuilder();
        serHelper(root,sb); return sb.toString();
    }
    void serHelper(Node node,StringBuilder sb){
        sb.append(node.val).append(" ").append(node.children.size()).append(" ");
        for(Node c:node.children) serHelper(c,sb);
    }
    public Node deserialize(String data) {
        if(data.isEmpty()) return null;
        Deque<String> q=new ArrayDeque<>(Arrays.asList(data.split(" ")));
        return desHelper(q);
    }
    Node desHelper(Deque<String> q){
        Node node=new Node(Integer.parseInt(q.poll())); int cnt=Integer.parseInt(q.poll());
        node.children=new ArrayList<>();
        for(int i=0;i<cnt;i++) node.children.add(desHelper(q));
        return node;
    }
}
