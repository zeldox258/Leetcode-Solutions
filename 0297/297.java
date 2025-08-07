import java.util.*;
public class Codec {
    public String serialize(TreeNode root){
        if(root==null) return "null";
        return root.val+","+serialize(root.left)+","+serialize(root.right);
    }
    public TreeNode deserialize(String data){
        return des(new LinkedList<>(Arrays.asList(data.split(","))));
    }
    TreeNode des(Queue<String> q){
        String val=q.poll();if(val.equals("null")) return null;
        TreeNode root=new TreeNode(Integer.parseInt(val));root.left=des(q);root.right=des(q);return root;
    }
}