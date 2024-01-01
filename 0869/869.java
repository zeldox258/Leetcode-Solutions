
class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] s = String.valueOf(n).toCharArray(); Arrays.sort(s);
        String sorted = new String(s);
        for (int i = 0; i < 30; i++) {
            char[] t = String.valueOf(1 << i).toCharArray(); Arrays.sort(t);
            if (sorted.equals(new String(t))) return true;
        }
        return false;
    }
}
