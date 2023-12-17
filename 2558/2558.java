class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Integer> list=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;

        for(int i=0;i<gifts.length;i++){
            list.add(gifts[i]);
        }

        for(int i=0;i<k;i++){
            int a=list.remove();
            double b=Math.floor(Math.sqrt(a));
            list.add((int)b);
        }
        
        for(int i=0;i<gifts.length;i++){
            sum=sum+list.remove();
        }
        
        return sum;
    }
}