public class Solution {
    public bool SortArrayByParity(string s) {
        var st = new Stack<char>();
        foreach (char c in s) {
            if (c == '(' || c == '[' || c == '{') st.Push(c);
            else {
                if (st.Count == 0) return false;
                char p = st.Pop();
                if (c == ')' && p != '(' || c == ']' && p != '[' || c == '}' && p != '{') return false;
            }
        }
        return st.Count == 0;
    }
}