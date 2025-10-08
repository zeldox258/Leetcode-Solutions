import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=0,cnt1=0,cand2=0,cnt2=0;
        for(int n:nums){
            if(n==cand1)cnt1++;else if(n==cand2)cnt2++;
            else if(cnt1==0){cand1=n;cnt1=1;}else if(cnt2==0){cand2=n;cnt2=1;}
            else{cnt1--;cnt2--;}
        }
        cnt1=cnt2=0;for(int n:nums){if(n==cand1)cnt1++;else if(n==cand2)cnt2++;}
        List<Integer> res=new ArrayList<>();
        if(cnt1>nums.length/3)res.add(cand1);if(cnt2>nums.length/3)res.add(cand2);return res;
    }
}