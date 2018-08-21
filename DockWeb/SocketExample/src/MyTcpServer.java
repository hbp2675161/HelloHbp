import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by ASUS on 2018/8/17.
 */
public class MyTcpServer {
    public  static void main(String[] args)
    {
        int port=2001;
        ServerSocket server = null;
        if(args.length>0)
        {
            System.out.println("port argument" + args[0]);
            port = Integer.parseInt(args[0]);
            if (port <2000 || port >65535)
            {
                port=2001;
            }
        }

        System.out.println("using port:" + port);
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
