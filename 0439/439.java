
class Solution {
    int idx=0; String s;
    public String parseTernary(String expression) {
        s=expression; return parse();
    }
    String parse(){
        String cur=""+s.charAt(idx++);
        if(idx>=s.length()||s.charAt(idx)!='?') return cur;
        idx++; String t=parse(); idx++; String f=parse();
        return cur.equals("T")?t:f;
    }
}
