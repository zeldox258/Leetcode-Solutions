
class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer,Integer> wmap=new HashMap<>();
        for(String w:words){
            int mask=0; for(char c:w.toCharArray()) mask|=1<<(c-'a');
            wmap.merge(mask,1,Integer::sum);
        }
        List<Integer> res=new ArrayList<>();
        for(String p:puzzles){
            int first=1<<(p.charAt(0)-'a'),pmask=0;
            for(char c:p.toCharArray()) pmask|=1<<(c-'a');
            int cnt=0,sub=pmask;
            while(sub>0){ if((sub&first)!=0) cnt+=wmap.getOrDefault(sub,0); sub=(sub-1)&pmask; }
            res.add(cnt);
        }
        return res;
    }
}
