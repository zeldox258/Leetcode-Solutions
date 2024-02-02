public class Solution {
    public int[] LongestPathWithDifferentAdjace(int[] nums) {
        int n = nums.Length;
        var res = new int[n];
        Array.Fill(res, -1);
        var st = new Stack<int>();
        for (int i = 0; i < n; i++) {
            while (st.Count > 0 && nums[st.Peek()] < nums[i]) res[st.Pop()] = nums[i];
            st.Push(i);
        }
        return res;
    }
}