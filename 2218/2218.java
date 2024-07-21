class Solution {
    public int[] solve2218(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        java.util.Arrays.fill(res,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i]) res[st.pop()]=nums[i];
            st.push(i);
        }
        return res;
    }
}