class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int j=0;
            while(j<s.length()){
                char c=s.charAt(j);int cnt=0;
                while(j<s.length()&&s.charAt(j)==c){j++;cnt++;}
                sb.append(cnt).append(c);
            }
            s=sb.toString();
        }
        return s;
    }
}