public class Solution {
    public int FindSubarrayWithBitwiseOrClose(string s) {
        var set = new HashSet<char>();
        int l = 0, res = 0;
        for (int r = 0; r < s.Length; r++) {
            while (set.Contains(s[r])) set.Remove(s[l++]);
            set.Add(s[r]);
            res = Math.Max(res, r - l + 1);
        }
        return res;
    }
}