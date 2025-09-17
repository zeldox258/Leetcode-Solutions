class Solution {
    public boolean verifyPreorder(int[] preorder) {
        int low=Integer.MIN_VALUE,i=-1;
        for(int p:preorder){
            if(p<low) return false;
            while(i>=0&&p>preorder[i]) low=preorder[i--];
            preorder[++i]=p;
        }
        return true;
    }
}