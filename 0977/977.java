
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length,l=0,r=n-1,i=n-1; int[]res=new int[n];
        while(l<=r){int a=nums[l]*nums[l],b=nums[r]*nums[r];if(a>b){res[i--]=a;l++;}else{res[i--]=b;r--;}} return res;
    }
}
