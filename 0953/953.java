
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[]rank=new int[26]; for(int i=0;i<26;i++) rank[order.charAt(i)-'a']=i;
        for(int i=0;i<words.length-1;i++){
            String a=words[i],b=words[i+1]; boolean found=false;
            for(int j=0;j<Math.min(a.length(),b.length());j++){
                if(rank[a.charAt(j)-'a']<rank[b.charAt(j)-'a']){found=true;break;} if(rank[a.charAt(j)-'a']>rank[b.charAt(j)-'a']) return false;
            }
            if(!found&&a.length()>b.length()) return false;
        }
        return true;
    }
}
