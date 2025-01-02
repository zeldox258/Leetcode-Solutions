class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
      int [] prefixS = new int[words.length];
      int s_and_e = 0;
      int i=0;
      for(String word:words){
        if(s_and_e(word)){
            s_and_e++;
        }
        prefixS[i++]=s_and_e;
      }
      int res[] = new int[queries.length];
      i=0;
      for(int[] query : queries){
        res[i++] = prefixS[query[1]] - (query[0] == 0? 0:prefixS[query[0]-1]);
      }
      return res;
    }
    private boolean s_and_e(String word){
        return isVowel(word.charAt(0)) && isVowel(word.charAt(word.length()-1));
    }
    private boolean isVowel(char c){
        return c=='a' ||  c=='e'|| c=='i'|| c=='o'|| c=='u';
    }
}