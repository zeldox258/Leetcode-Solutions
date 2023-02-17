
class Solution {
    public String encode(int num) {
        num++;
        StringBuilder sb=new StringBuilder();
        while(num>1){sb.append((char)('a'+((num-1)%26)));num=(num-1)/26+1;}
        return sb.reverse().toString();
    }
}
