
class ZeroEvenOdd {
    private int n;
    private Semaphore zeroSem=new Semaphore(1),evenSem=new Semaphore(0),oddSem=new Semaphore(0);
    public ZeroEvenOdd(int n){this.n=n;}
    public void zero(IntConsumer out) throws InterruptedException {
        for(int i=1;i<=n;i++){zeroSem.acquire();out.accept(0);if(i%2==0)evenSem.release();else oddSem.release();}
    }
    public void even(IntConsumer out) throws InterruptedException {
        for(int i=2;i<=n;i+=2){evenSem.acquire();out.accept(i);zeroSem.release();}
    }
    public void odd(IntConsumer out) throws InterruptedException {
        for(int i=1;i<=n;i+=2){oddSem.acquire();out.accept(i);zeroSem.release();}
    }
}
