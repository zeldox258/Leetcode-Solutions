class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int [] res = new int[queries.length];
        int max=0;
        for(int i=0; i<items.length; i++){
            max = Math.max(max, items[i][1]);
            items[i][1]=max;
        }
        for(int i=0; i<queries.length; i++){
            res[i] = binarySearch(items, queries[i]);
        }
        return res;
    }
    private int binarySearch(int [][] items , int target){
        int l=0;
        int r= items.length-1;
        int max=0;
        while(l<=r){
            int mid = l+ (r-l)/2;
            if(items[mid][0]>target){
                r = mid-1;
            }else{
                max = Math.max(max, items[mid][1]);
                l =  mid+1;
            }
        }
        return max;
    }
}