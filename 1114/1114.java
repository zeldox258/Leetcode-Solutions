
class Solution {
    private final Object lock1=new Object(), lock2=new Object();
    private boolean oneDone=false, twoDone=false;
    public void first(Runnable p){ p.run(); synchronized(lock1){oneDone=true;lock1.notifyAll();} }
    public void second(Runnable p) throws InterruptedException {
        synchronized(lock1){while(!oneDone)lock1.wait();}
        p.run(); synchronized(lock2){twoDone=true;lock2.notifyAll();}
    }
    public void third(Runnable p) throws InterruptedException {
        synchronized(lock2){while(!twoDone)lock2.wait();}
        p.run();
    }
}
