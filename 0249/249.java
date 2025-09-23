import java.util.*;
class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strings){
            char[] arr=s.toCharArray();
            int diff=arr[0]-'a';
            for(int i=0;i<arr.length;i++) arr[i]=(char)((arr[i]-'a'-diff+26)%26+'a');
            String key=new String(arr);
            map.computeIfAbsent(key,x->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}