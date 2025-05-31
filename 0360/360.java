
import java.util.*;
class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int n=nums.length; int[] res=new int[n];
        int i=0,j=n-1,idx=a>=0?n-1:0;
        while(i<=j){
            int lo=calc(nums[i],a,b,c),hi=calc(nums[j],a,b,c);
            if(a>=0){if(lo>=hi){res[idx--]=lo;i++;}else{res[idx--]=hi;j--;}}
            else{if(lo<=hi){res[idx++]=lo;i++;}else{res[idx++]=hi;j--;}}
        }
        return res;
    }
    int calc(int x,int a,int b,int c){return a*x*x+b*x+c;}
}
