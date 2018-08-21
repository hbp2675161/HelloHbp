import java.util.concurrent.BlockingQueue;

/**
 * Created by ASUS on 2018/7/18.
 */
public class ConsuProducer implements Runnable {
    private BlockingQueue shareQ;
    public ConsuProducer(BlockingQueue shareQ)
    {
        this.shareQ=shareQ;
    }

    @Override
    public void run() {
        while(true)
        {
            try{
                System.out.println("Consumer"+shareQ.take());
            }catch (InterruptedException ex)
            {
                System.out.println("Consumer已经暂停！！");
            }
        }
    }
}
