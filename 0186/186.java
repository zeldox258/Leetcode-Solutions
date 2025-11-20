class Solution {
    public void reverseWords(char[] s) {
        reverse(s,0,s.length-1);
        int start=0;
        for(int i=0;i<=s.length;i++){
            if(i==s.length||s[i]==' '){reverse(s,start,i-1);start=i+1;}
        }
    }
    void reverse(char[] s,int l,int r){while(l<r){char t=s[l];s[l++]=s[r];s[r--]=t;}}
}