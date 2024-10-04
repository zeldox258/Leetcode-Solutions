
import java.util.*;
class Solution {
    public boolean wordSquare(List<String> words) {
        if(words.isEmpty()) return true;
        int n=words.size();
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) if(words.get(i).charAt(j)!=words.get(j).charAt(i)) return false;
        return true;
    }
}
