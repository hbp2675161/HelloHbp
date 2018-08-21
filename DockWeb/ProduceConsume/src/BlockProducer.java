import sun.net.www.protocol.http.HttpURLConnection;

import java.util.concurrent.BlockingQueue;

/**
 * Created by ASUS on 2018/7/18.
 */
public class BlockProducer implements Runnable
{
    private final BlockingQueue sharedQueue;

    public BlockProducer(BlockingQueue sharedQueue)
    {
        this.sharedQueue = sharedQueue;
    }
    @Override
    public void run()
    {
        for(int i=0; i<10; i++) {
            try {
                System.out.println("Producer" + i);
                sharedQueue.put(i);
            } catch (InterruptedException ex) {
                System.out.println("Producer 已经中断！");
            }
        }
    }
}
