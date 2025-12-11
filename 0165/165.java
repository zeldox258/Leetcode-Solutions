class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\."),v2=version2.split("\\.");
        int n=Math.max(v1.length,v2.length);
        for(int i=0;i<n;i++){
            int a=i<v1.length?Integer.parseInt(v1[i]):0;
            int b=i<v2.length?Integer.parseInt(v2[i]):0;
            if(a!=b) return a>b?1:-1;
        }
        return 0;
    }
}