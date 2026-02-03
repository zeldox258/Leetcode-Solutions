class Solution {
    ListNode cur;
    public TreeNode sortedListToBST(ListNode head) {
        int size=0;ListNode tmp=head;while(tmp!=null){size++;tmp=tmp.next;}
        cur=head;return build(0,size-1);
    }
    TreeNode build(int l,int r){
        if(l>r) return null;
        int mid=(l+r)/2;
        TreeNode left=build(l,mid-1);
        TreeNode root=new TreeNode(cur.val);cur=cur.next;
        root.left=left;root.right=build(mid+1,r);
        return root;
    }
}