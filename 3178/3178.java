class Solution {
    public int numberOfChild(int n, int k) {
        return (n-1) - Math.abs((n-1) - k%((n-1)*2));
    }
}