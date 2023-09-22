
class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length; java.util.Stack<Integer> st=new java.util.Stack<>();
        for(int i=0;i<n;i++) if(st.isEmpty()||nums[st.peek()]>nums[i]) st.push(i);
        int res=0; for(int i=n-1;i>=0;i--) while(!st.isEmpty()&&nums[st.peek()]<=nums[i]) res=Math.max(res,i-st.pop());
        return res;
    }
}
