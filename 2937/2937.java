class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int l1 = s1.length(), l2 = s2.length(), l3 = s3.length();
        int len = Math.min(Math.min(l1, l2), l3);
        int c = 0;
        for(int i = 0; i < len; i++){
            if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)){
                c++;
            }else{
                break;
            }
        }
        int s = (l1 - c) + (l2 - c) + (l3 - c);
        return c == 0 ? -1 : s;
    }
}