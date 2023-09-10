
class Solution {
    public int oddEvenJumps(int[] arr) {
        int n=arr.length,res=1; boolean[]odd=new boolean[n],even=new boolean[n]; odd[n-1]=even[n-1]=true;
        java.util.TreeMap<Integer,Integer> tm=new java.util.TreeMap<>(); tm.put(arr[n-1],n-1);
        for(int i=n-2;i>=0;i--){ java.util.Map.Entry<Integer,Integer> lo=tm.ceilingEntry(arr[i]),hi=tm.floorEntry(arr[i]); if(lo!=null) odd[i]=even[lo.getValue()]; if(hi!=null) even[i]=odd[hi.getValue()]; if(odd[i]) res++; tm.put(arr[i],i); }
        return res;
    }
}
