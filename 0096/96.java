class Solution {
    public int numTrees(int n) {
        long ans=1;
        for(int i=0;i<n;i++) ans=ans*2*(2*i+1)/(i+2);
        return (int)ans;
    }
}