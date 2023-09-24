public class Solution {
    public int AllPossibleFullBinaryTrees(int n) {
        int count = 0;
        while (n != 0) { count += n & 1; n >>= 1; }
        return count;
    }
}