package Threads;

//instance of runnable object
public class runImp implements Runnable {
    @Override
    public void run() {

        //task to perform
        for(int i=1;i<=10;i++)
        {
            System.out.println("B : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
