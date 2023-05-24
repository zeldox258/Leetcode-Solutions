
class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        int n=values.length; Integer[]idx=new Integer[n]; for(int i=0;i<n;i++) idx[i]=i;
        java.util.Arrays.sort(idx,(a,b)->values[b]-values[a]);
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>(); int res=0,used=0;
        for(int i:idx){if(used==numWanted)break;int label=labels[i];if(cnt.getOrDefault(label,0)<useLimit){res+=values[i];cnt.merge(label,1,Integer::sum);used++;}}
        return res;
    }
}
