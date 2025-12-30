import java.util.*;
class Solution {
    private int cap;
    private Map<Integer,Integer> cache=new LinkedHashMap<>();
    public Solution(int capacity){this.cap=capacity;}
    public int get(int key){if(!cache.containsKey(key))return -1;int val=cache.remove(key);cache.put(key,val);return val;}
    public void put(int key,int value){if(cache.containsKey(key))cache.remove(key);else if(cache.size()==cap){Iterator<Integer> it=cache.keySet().iterator();it.next();it.remove();}cache.put(key,value);}
}