package com.hwtechservicesllc.nyuscpsf2014.s03.myTimeServerAndClient;

import java.io.IOException;

public class TimeClientMain {

    public static void main(String[] args) {
        // write your code here
        int port = 1971; // pick a port above 1024 (<1024 need root access)
        int backlog = 100; // socket queue length
        TimeClient tClient = null;
        String serverHost = "localhost";
//        String serverHost = "172.22.14.89";

        try {
            tClient = new TimeClient("myTimeClient",serverHost,port);
            tClient.runClient();
        }
        catch (Exception ex2) {
            System.err.println(ex2);
        }
        finally {
            if (tClient != null) {
                tClient.closeConnection();
            }
        }
    }
}
