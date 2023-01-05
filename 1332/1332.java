
class Solution {
    public int removePalindromeSub(String s) {
        if(s.isEmpty()) return 0;
        String rev=new StringBuilder(s).reverse().toString();
        return s.equals(rev)?1:2;
    }
}
