class Solution {
    public boolean rotateString(String A, String B) {
        if(A.equals(B)) return true;
     int a = A.length();
     int b = A.length();
     String[] array = A.split("");
     String[] result = new String[b];
        while(a!=0){
             String s = "";
            result[0]=array[b-1];
            for(int i=1;i<b;i++){
                result[i] = array[i-1];
            }
            for(int i=0;i<b;i++){
                s +=result[i];
            }
            if(B.equals(s)) return true;
            a--;
            array = s.split("");
        }
        return false;
    }
}