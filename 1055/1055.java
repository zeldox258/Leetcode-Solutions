
class Solution {
    public int shortestWay(String source, String target) {
        boolean[]inSrc=new boolean[26]; for(char c:source.toCharArray()) inSrc[c-'a']=true;
        for(char c:target.toCharArray()) if(!inSrc[c-'a']) return -1;
        int count=0,j=0;
        while(j<target.length()){count++;for(int i=0;i<source.length()&&j<target.length();i++) if(source.charAt(i)==target.charAt(j)) j++;}
        return count;
    }
}
