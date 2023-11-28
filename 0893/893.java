
class Solution {
    public int numSpecialEquivGroups(String[] words) {
        Set<String> set = new HashSet<>();
        for (String w : words) {
            char[] odd = new char[w.length()/2 + (w.length()%2)], even = new char[w.length()/2];
            int oi = 0, ei = 0;
            for (int i = 0; i < w.length(); i++) { if (i%2==0) odd[oi++]=w.charAt(i); else even[ei++]=w.charAt(i); }
            Arrays.sort(odd); Arrays.sort(even);
            set.add(new String(odd) + new String(even));
        }
        return set.size();
    }
}
