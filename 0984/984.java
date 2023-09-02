
class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb=new StringBuilder();
        while(a>0||b>0){boolean writeA=(sb.length()>=2&&sb.charAt(sb.length()-1)=='a'&&sb.charAt(sb.length()-2)=='a')?false:(a>=b);if(sb.length()>=2&&sb.charAt(sb.length()-1)==(writeA?'a':'b')&&sb.charAt(sb.length()-2)==(writeA?'a':'b'))writeA=!writeA;if(writeA){sb.append('a');a--;}else{sb.append('b');b--;}}
        return sb.toString();
    }
}
