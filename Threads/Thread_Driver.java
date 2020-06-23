package Threads;

public class Thread_Driver{
    public static void main(String[] args)
    {
        // lambda usage
        Thread a = new Thread(()->{ //runnable lambda directly calling run

           //task to perform
            for(int i =1;i<=10;i++)
            {
                System.out.println("A : "+i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //non lambda
        runImp runB = new runImp();     //runnable object of runnable class
        Thread b =  new Thread(runB);       //creating thread using runnable object

        //start a
        a.start();

        /*waiting for 'a' to finish and start 'b'
        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //start b
        b.start();
    }
}
