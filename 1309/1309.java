
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){sb.append((char)('a'+Integer.parseInt(s.substring(i-2,i))-1));i-=2;}
            else sb.append((char)('a'+s.charAt(i)-'1'));
        }
        return sb.reverse().toString();
    }
}
