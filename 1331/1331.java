
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted=arr.clone();
        Arrays.sort(sorted);
        Map<Integer,Integer> rank=new HashMap<>();
        int r=1;
        for(int v:sorted) if(!rank.containsKey(v)) rank.put(v,r++);
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++) res[i]=rank.get(arr[i]);
        return res;
    }
}
