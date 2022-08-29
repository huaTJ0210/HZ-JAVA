package hz.thread;

public class HZThread implements  Runnable{
    private Thread t;
    private String threadName;
    public HZThread(String name){
        threadName = name;
        System.out.println("Creating:"+threadName);
    }

    public void run(){
        System.out.println("Running:"+threadName);
        try {
           for(int i = 4;i>0;i--){
              System.out.println("Thread:"+threadName+"," + i);
              Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void start(){
        System.out.println("Starting:"+threadName);
        if(t ==null){
            t = new Thread(this,threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        HZThread thread1 = new HZThread("thread1");
        thread1.start();
    }
}
