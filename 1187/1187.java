
class Solution {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        int n=arr1.length;
        Map<Integer,Integer> dp=new HashMap<>();
        dp.put(-1,0);
        for(int i=0;i<n;i++){
            Map<Integer,Integer> ndp=new HashMap<>();
            for(Map.Entry<Integer,Integer> e:dp.entrySet()){
                int prev=e.getKey(),cost=e.getValue();
                if(arr1[i]>prev) ndp.merge(arr1[i],cost,Math::min);
                int pos=upperBound(arr2,prev);
                if(pos<arr2.length) ndp.merge(arr2[pos],cost+1,Math::min);
            }
            dp=ndp;
        }
        return dp.isEmpty()?-1:Collections.min(dp.values());
    }
    int upperBound(int[] a,int v){int lo=0,hi=a.length;while(lo<hi){int m=(lo+hi)/2;if(a[m]<=v)lo=m+1;else hi=m;}return lo;}
}
