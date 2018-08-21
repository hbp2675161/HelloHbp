import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by ASUS on 2018/7/18.
 */
public class ProducerConsumerPattern {
    public static void main(String[] args)
    {
        BlockingQueue sharedQ = new LinkedBlockingDeque();
        Thread proThread = new Thread(new BlockProducer(sharedQ));
        Thread consuThread = new Thread(new ConsuProducer(sharedQ));
        proThread.start();
        consuThread.start();
    }
}
