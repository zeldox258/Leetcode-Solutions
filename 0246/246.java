class Solution {
    public boolean isStrobogrammatic(String num) {
        int l=0,r=num.length()-1;
        while(l<=r){
            char a=num.charAt(l),b=num.charAt(r);
            if(a=='0'&&b=='0'||a=='1'&&b=='1'||a=='8'&&b=='8'||a=='6'&&b=='9'||a=='9'&&b=='6'){l++;r--;}
            else return false;
        }
        return true;
    }
}