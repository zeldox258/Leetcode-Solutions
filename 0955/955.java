
class Solution {
    public int minDeletionSize(String[] strs) {
        int n=strs.length,m=strs[0].length(),res=0; boolean[]sorted=new boolean[n-1];
        for(int j=0;j<m;j++){boolean[]newSorted=sorted.clone();boolean del=false;for(int i=0;i<n-1;i++){if(!sorted[i]&&strs[i].charAt(j)>strs[i+1].charAt(j)){del=true;break;}if(!sorted[i]&&strs[i].charAt(j)<strs[i+1].charAt(j))newSorted[i]=true;}if(del)res++;else sorted=newSorted;}
        return res;
    }
}
