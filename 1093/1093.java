
class Solution {
    public double[] sampleStats(int[] count) {
        double mn=256,mx=-1,mean=0,mode=0,median=0;int total=0,maxCnt=0;
        for(int i=0;i<256;i++)if(count[i]>0){if(i<mn)mn=i;if(i>mx)mx=i;total+=count[i];mean+=i*(double)count[i];if(count[i]>maxCnt){maxCnt=count[i];mode=i;}}
        mean/=total; int lo=0,mid1=(total+1)/2,mid2=(total+2)/2;double m1=-1,m2=-1;
        for(int i=0;i<256;i++){lo+=count[i];if(m1<0&&lo>=mid1)m1=i;if(m2<0&&lo>=mid2)m2=i;} median=(m1+m2)/2;
        return new double[]{mn,mx,mean,median,mode};
    }
}
