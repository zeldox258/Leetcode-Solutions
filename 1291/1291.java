
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=9;i++) q.offer(i);
        while(!q.isEmpty()){
            int n=q.poll();
            if(n>=low&&n<=high) res.add(n);
            int last=n%10;
            if(last<9) q.offer(n*10+last+1);
        }
        return res;
    }
}
