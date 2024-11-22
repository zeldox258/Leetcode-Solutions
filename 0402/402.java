
class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:num.toCharArray()){
            while(k>0&&sb.length()>0&&sb.charAt(sb.length()-1)>c){sb.deleteCharAt(sb.length()-1);k--;}
            sb.append(c);
        }
        while(k-->0) sb.deleteCharAt(sb.length()-1);
        int start=0; while(start<sb.length()-1&&sb.charAt(start)=='0') start++;
        return sb.substring(start);
    }
}
