
class Solution {
    public int maximum69Number(int num) {
        String s=String.valueOf(num);
        return Integer.parseInt(s.replaceFirst("6","9"));
    }
}
