class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int C[]=new int[A.length];
        HashSet<Integer> set=new HashSet<>();

        int i=0,j=0;
        int c=0;
        while(i<A.length && j<B.length){
             if(set.contains(A[i])){
                c++;
            }
           else  {
                set.add(A[i]);

            }

             if(set.contains(B[j])){
                c++;
            }
            else{
               set.add(B[j]);
            }
            C[i]=c;
            i++;
            j++;


        }
        return C;

    }
}