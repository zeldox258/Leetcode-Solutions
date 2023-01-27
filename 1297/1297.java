
class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String,Integer> cnt=new HashMap<>();
        int res=0;
        for(int i=0;i<=s.length()-minSize;i++){
            String sub=s.substring(i,i+minSize);
            Set<Character> sc=new HashSet<>();
            for(char c:sub.toCharArray()) sc.add(c);
            if(sc.size()<=maxLetters){cnt.merge(sub,1,Integer::sum);res=Math.max(res,cnt.get(sub));}
        }
        return res;
    }
}
