
class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n/2; i++)
            for (int j = 1; Math.max(i,j) <= n-i-j; j++)
                if (check(num, 0, i, j)) return true;
        return false;
    }
    boolean check(String num, int start, int len1, int len2) {
        if (num.charAt(start)=='0'&&len1>1) return false;
        if (num.charAt(start+len1)=='0'&&len2>1) return false;
        String s1 = num.substring(start, start+len1);
        String s2 = num.substring(start+len1, start+len1+len2);
        String sum = addStrings(s1, s2);
        int end = start+len1+len2+sum.length();
        if (!num.startsWith(sum, start+len1+len2)) return false;
        if (end == num.length()) return true;
        return check(num, start+len1, len2, sum.length());
    }
    String addStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1, j=b.length()-1, carry=0;
        while (i>=0||j>=0||carry>0) {
            int sum = carry;
            if (i>=0) sum+=a.charAt(i--)-'0';
            if (j>=0) sum+=b.charAt(j--)-'0';
            sb.append(sum%10); carry=sum/10;
        }
        return sb.reverse().toString();
    }
}
