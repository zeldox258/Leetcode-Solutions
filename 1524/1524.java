class Solution {
    int MOD=1000000007;
    public int numOfSubarrays(int[] arr) {
        int even=1,odd=0,ans=0,prefix_sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            prefix_sum+=arr[i];
            if(prefix_sum%2==0){ans+=odd; even++;}
            else{ ans+=even; odd++;}
            ans%=MOD;
        }
        return ans;
    }
}