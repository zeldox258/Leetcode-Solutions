import java.util.*;
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<words.length){
            int len=words[i].length(),j=i+1;
            while(j<words.length&&len+1+words[j].length()<=maxWidth) len+=1+words[j++].length();
            StringBuilder sb=new StringBuilder(words[i]);
            int gaps=j-i-1;
            if(j==words.length||gaps==0){
                for(int k=i+1;k<j;k++) sb.append(' ').append(words[k]);
                while(sb.length()<maxWidth) sb.append(' ');
            } else {
                int totalSpaces=maxWidth-len+gaps;
                int spacePerGap=totalSpaces/gaps,extra=totalSpaces%gaps;
                for(int k=i+1;k<j;k++){
                    for(int s=0;s<spacePerGap+(k-i<=extra?1:0);s++) sb.append(' ');
                    sb.append(words[k]);
                }
            }
            res.add(sb.toString());i=j;
        }
        return res;
    }
}