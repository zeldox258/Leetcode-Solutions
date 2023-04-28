
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> rank=new HashMap<>();
        for(int i=0;i<arr2.length;i++) rank.put(arr2[i],i);
        Integer[] a=new Integer[arr1.length];
        for(int i=0;i<arr1.length;i++) a[i]=arr1[i];
        Arrays.sort(a,(x,y)->{ int rx=rank.getOrDefault(x,1001+x),ry=rank.getOrDefault(y,1001+y); return rx-ry; });
        for(int i=0;i<arr1.length;i++) arr1[i]=a[i];
        return arr1;
    }
}
