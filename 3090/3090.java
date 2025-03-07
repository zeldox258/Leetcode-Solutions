class Solution {
    public int maximumLengthSubstring(String s) {
        int m=0;
        for(int i=0;i<s.length();i++){
            int k=0;
            int[] f=new int[26];
            for(int j=i;j<s.length();j++){
                f[s.charAt(j)-'a']++;
                if(f[s.charAt(j)-'a']>2)
                break;
                k++;
            }
            m=Math.max(m,k);
        }
        return m;
    }
}