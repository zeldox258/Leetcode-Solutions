import java.util.*;
class ValidWordAbbr {
    private Map<String,Set<String>> map=new HashMap<>();
    public ValidWordAbbr(String[] dictionary){for(String w:dictionary){String a=abbr(w);map.computeIfAbsent(a,x->new HashSet<>()).add(w);}}
    public boolean isUnique(String word){String a=abbr(word);return!map.containsKey(a)||map.get(a).size()==1&&map.get(a).contains(word);}
    String abbr(String w){return w.length()<=2?w:w.charAt(0)+(""+(w.length()-2))+w.charAt(w.length()-1);}
}