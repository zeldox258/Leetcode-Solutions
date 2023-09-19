
class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        java.util.Set<String> exact=new java.util.HashSet<>(); java.util.Map<String,String> capMap=new java.util.HashMap<>(),vowelMap=new java.util.HashMap<>();
        for(String w:wordlist){exact.add(w);capMap.putIfAbsent(w.toLowerCase(),w);vowelMap.putIfAbsent(toVowel(w),w);}
        String[]res=new String[queries.length];
        for(int i=0;i<queries.length;i++){String q=queries[i];if(exact.contains(q))res[i]=q;else if(capMap.containsKey(q.toLowerCase()))res[i]=capMap.get(q.toLowerCase());else if(vowelMap.containsKey(toVowel(q)))res[i]=vowelMap.get(toVowel(q));else res[i]="";}
        return res;
    }
    String toVowel(String s){return s.toLowerCase().replaceAll("[aeiou]","*");}
}
