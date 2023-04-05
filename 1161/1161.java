
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=0,maxLevel=0,maxSum=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            level++;
            int sz=q.size(),sum=0;
            for(int i=0;i<sz;i++){
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            if(sum>maxSum){maxSum=sum;maxLevel=level;}
        }
        return maxLevel;
    }
}
