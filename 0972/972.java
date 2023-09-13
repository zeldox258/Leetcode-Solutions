
class Solution {
    public boolean isRationalEqual(String s, String t) { return Math.abs(toDouble(s)-toDouble(t))<1e-9; }
    double toDouble(String s){
        if(!s.contains("("))return Double.parseDouble(s);
        String nonRep=s.substring(0,s.indexOf("(")),rep=s.substring(s.indexOf("(")+1,s.length()-1);
        double base=Double.parseDouble(nonRep),dec=Double.parseDouble(rep);
        int decimals=nonRep.contains(".")?nonRep.length()-nonRep.indexOf(".")-1:0;
        return base+dec/(Math.pow(10,rep.length())-1)/Math.pow(10,decimals);
    }
}
