
class H2O {
    private Semaphore hSem=new Semaphore(2),oSem=new Semaphore(0);
    private int hCount=0;
    public void hydrogen(Runnable r) throws InterruptedException {
        hSem.acquire(); r.run();
        synchronized(this){hCount++;if(hCount==2){hCount=0;oSem.release();}}
    }
    public void oxygen(Runnable r) throws InterruptedException {
        oSem.acquire(); r.run(); hSem.release(2);
    }
}
