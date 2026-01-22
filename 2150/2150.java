class Solution {
    public String solve2150(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)) sb.append(Character.toLowerCase(c));
        }
        String t=sb.toString();
        return t.equals(sb.reverse().toString())?"true":"false";
    }
}