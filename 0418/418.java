
class Solution {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        String s=String.join(" ",sentence)+" "; int n=s.length(),total=0;
        int[] next=new int[n];
        for(int i=0;i<n;i++){int j=(i+cols)%n;if(s.charAt(j)==' ')next[i]=(i+cols+1)%n;else{while(j>0&&s.charAt(j)!=' ')j--;next[i]=j;}if(next[i]<(i+cols+1)%n&&i+cols+1>n)next[i]+=n;}
        // simple approach
        int cur=0;
        for(int i=0;i<rows;i++){cur+=cols+1;while(s.charAt(cur%n)!=' ')cur--;cur++;}
        return cur/n;
    }
}
