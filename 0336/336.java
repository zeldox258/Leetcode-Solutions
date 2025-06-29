
import java.util.*;
class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        Map<String,Integer> map=new HashMap<>();
        List<List<Integer>> res=new ArrayList<>();
        for (int i=0;i<words.length;i++) map.put(words[i],i);
        for (int i=0;i<words.length;i++) {
            String w=words[i]; int n=w.length();
            for (int j=0;j<=n;j++) {
                String left=w.substring(0,j), right=w.substring(j);
                if (isPalin(left)) {
                    String rev=new StringBuilder(right).reverse().toString();
                    if (map.containsKey(rev)&&map.get(rev)!=i) res.add(Arrays.asList(map.get(rev),i));
                }
                if (j>0&&isPalin(right)) {
                    String rev=new StringBuilder(left).reverse().toString();
                    if (map.containsKey(rev)&&map.get(rev)!=i) res.add(Arrays.asList(i,map.get(rev)));
                }
            }
        }
        return res;
    }
    boolean isPalin(String s) { int l=0,r=s.length()-1; while(l<r) if(s.charAt(l++)!=s.charAt(r--)) return false; return true; }
}
