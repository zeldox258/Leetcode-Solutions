class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }
    TreeNode build(int[] nums,int l,int r){
        if(l>r) return null;
        int mid=(l+r)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=build(nums,l,mid-1);root.right=build(nums,mid+1,r);
        return root;
    }
}