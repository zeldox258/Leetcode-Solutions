
class Solution {
    String res=null;
    public String smallestFromLeaf(TreeNode root){dfs(root,new StringBuilder());return res;}
    void dfs(TreeNode node,StringBuilder sb){if(node==null)return;sb.append((char)('a'+node.val));if(node.left==null&&node.right==null){String s=sb.reverse().toString();if(res==null||s.compareTo(res)<0)res=s;sb.reverse();}else{dfs(node.left,sb);dfs(node.right,sb);}sb.deleteCharAt(sb.length()-1);}
}
