
class FooBar {
    private int n;
    private Semaphore fooSem=new Semaphore(1), barSem=new Semaphore(0);
    public FooBar(int n){ this.n=n; }
    public void foo(Runnable p) throws InterruptedException {
        for(int i=0;i<n;i++){fooSem.acquire();p.run();barSem.release();}
    }
    public void bar(Runnable p) throws InterruptedException {
        for(int i=0;i<n;i++){barSem.acquire();p.run();fooSem.release();}
    }
}
