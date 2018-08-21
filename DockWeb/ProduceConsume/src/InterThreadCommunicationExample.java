import sun.awt.windows.ThemeReader;

import javax.swing.plaf.TableHeaderUI;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

/**
 * Created by ASUS on 2018/7/18.
 */
public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        final Queue sharedQ = new LinkedList();
        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);
        producer.start();
        consumer.start();
    }
}
