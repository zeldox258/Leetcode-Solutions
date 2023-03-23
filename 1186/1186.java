
class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length,res=arr[0];
        int dpno=arr[0],dpyes=Integer.MIN_VALUE/2;
        for(int i=1;i<n;i++){
            int nno=Math.max(dpno,0)+arr[i];
            int nyes=Math.max(dpyes+arr[i],dpno);
            dpno=nno; dpyes=nyes;
            res=Math.max(res,Math.max(dpno,dpyes));
        }
        return res;
    }
}
