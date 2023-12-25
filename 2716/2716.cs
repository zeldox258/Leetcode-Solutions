public class Solution {
    public int MinimizedStringLength(string s) {
        HashSet<char> set = new HashSet<char>();
        foreach (char c in s)
        {
            set.Add(c);
        }
        return set.Count;
    }
}