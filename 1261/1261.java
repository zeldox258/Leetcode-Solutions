class FindElements {
    Set<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
        root.val = 0;
        recover(root);
    }
    void recover(TreeNode root){

        if(root == null) return;
        set.add(root.val);
        if(root.left!=null){
            root.left.val = root.val*2+1;
            recover(root.left);
        }
        if(root.right!=null){
            root.right.val = root.val*2+2;
            recover(root.right);
        }

    }

    public boolean find(int target) {
        return set.contains(target);
    }
}
