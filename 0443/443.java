
class Solution {
    public int compress(char[] chars) {
        int write=0,i=0;
        while(i<chars.length){char c=chars[i];int cnt=0;while(i<chars.length&&chars[i]==c){i++;cnt++;}chars[write++]=c;if(cnt>1){for(char ch:(""+cnt).toCharArray())chars[write++]=ch;}}
        return write;
    }
}
