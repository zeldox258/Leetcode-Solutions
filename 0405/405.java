
class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        StringBuilder sb=new StringBuilder(); char[] hex="0123456789abcdef".toCharArray();
        for(int i=0;i<8&&num!=0;i++){sb.append(hex[num&0xF]);num>>>=4;}
        return sb.reverse().toString();
    }
}
