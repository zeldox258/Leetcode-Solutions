
import java.util.*;
class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> bankSet=new HashSet<>(Arrays.asList(bank));
        if(!bankSet.contains(endGene)) return -1;
        Queue<String> q=new LinkedList<>(); q.offer(startGene);
        Set<String> visited=new HashSet<>(); visited.add(startGene); int steps=0;
        char[] genes={'A','C','G','T'};
        while(!q.isEmpty()){for(int sz=q.size();sz>0;sz--){String cur=q.poll();if(cur.equals(endGene))return steps;char[] arr=cur.toCharArray();for(int i=0;i<arr.length;i++){char orig=arr[i];for(char g:genes){arr[i]=g;String next=new String(arr);if(bankSet.contains(next)&&visited.add(next))q.offer(next);}arr[i]=orig;}}steps++;}
        return -1;
    }
}
