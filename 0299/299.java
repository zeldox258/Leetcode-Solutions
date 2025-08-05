class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0,cows=0;int[] sct=new int[10],gss=new int[10];
        for(int i=0;i<secret.length();i++){if(secret.charAt(i)==guess.charAt(i))bulls++;else{sct[secret.charAt(i)-'0']++;gss[guess.charAt(i)-'0']++;}}
        for(int i=0;i<10;i++) cows+=Math.min(sct[i],gss[i]);
        return bulls+"A"+cows+"B";
    }
}