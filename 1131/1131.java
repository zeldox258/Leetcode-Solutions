
class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE,max4=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max1=Math.max(max1,arr1[i]+arr2[i]+i);
            max2=Math.max(max2,arr1[i]-arr2[i]+i);
            max3=Math.max(max3,-arr1[i]+arr2[i]+i);
            max4=Math.max(max4,-arr1[i]-arr2[i]+i);
        }
        int res=0;
        for(int i=0;i<n;i++){
            res=Math.max(res,max1-arr1[i]-arr2[i]-i);
            res=Math.max(res,max2-arr1[i]+arr2[i]-i);
            res=Math.max(res,max3+arr1[i]-arr2[i]-i);
            res=Math.max(res,max4+arr1[i]+arr2[i]-i);
        }
        return res;
    }
}
