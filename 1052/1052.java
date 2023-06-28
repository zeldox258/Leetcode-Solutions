
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length,base=0,extra=0,maxExtra=0;
        for(int i=0;i<n;i++)if(grumpy[i]==0)base+=customers[i]; for(int i=0;i<minutes;i++)if(grumpy[i]==1)extra+=customers[i]; maxExtra=extra;
        for(int i=minutes;i<n;i++){if(grumpy[i]==1)extra+=customers[i];if(grumpy[i-minutes]==1)extra-=customers[i-minutes];maxExtra=Math.max(maxExtra,extra);}
        return base+maxExtra;
    }
}
