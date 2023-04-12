
class Solution {
    int[] cnt=new int[2];
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        countNodes(root,x);
        int left=cnt[0],right=cnt[1],parent=n-1-left-right;
        return Math.max(Math.max(left,right),parent)>n/2;
    }
    int countNodes(TreeNode node,int x){
        if(node==null) return 0;
        int l=countNodes(node.left,x),r=countNodes(node.right,x);
        if(node.val==x){cnt[0]=l;cnt[1]=r;}
        return l+r+1;
    }
}
