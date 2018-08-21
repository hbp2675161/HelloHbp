import java.util.Queue;
import java.util.logging.Logger;

/**
 * Created by ASUS on 2018/7/18.
 */
public class Producer extends Thread
{
    private final Queue sharedQ;

    public Producer(Queue sharedQ) {
        super("Producer");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {

            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() == 3) {
                    try {
                       System.out.println("Queue is full, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println("producing : " + i);
                sharedQ.add(i);
                sharedQ.notify();
            }
        }
    }
}
