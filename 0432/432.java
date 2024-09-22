
import java.util.*;
class AllOne {
    TreeMap<Integer,Set<String>> cntMap=new TreeMap<>(); Map<String,Integer> keyMap=new HashMap<>();
    public void inc(String key){int c=keyMap.getOrDefault(key,0);keyMap.put(key,c+1);if(c>0)cntMap.get(c).remove(key);cntMap.computeIfAbsent(c+1,k->new HashSet<>()).add(key);if(c>0&&cntMap.get(c).isEmpty())cntMap.remove(c);}
    public void dec(String key){int c=keyMap.get(key);if(c==1)keyMap.remove(key);else keyMap.put(key,c-1);cntMap.get(c).remove(key);if(c>1)cntMap.computeIfAbsent(c-1,k->new HashSet<>()).add(key);if(cntMap.get(c).isEmpty())cntMap.remove(c);}
    public String getMaxKey(){return cntMap.isEmpty()?"":cntMap.lastEntry().getValue().iterator().next();}
    public String getMinKey(){return cntMap.isEmpty()?"":cntMap.firstEntry().getValue().iterator().next();}
}
