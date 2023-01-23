
class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        inorder(root1); inorder(root2);
        Collections.sort(list); return list;
    }
    void inorder(TreeNode node){ if(node==null) return; inorder(node.left); list.add(node.val); inorder(node.right); }
}
