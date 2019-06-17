package com.zjh.starter;

import com.zjh.web.server.TomcatServer;
import org.apache.catalina.LifecycleException;

/**
 * @PackageName: com.zjh.starter
 * @ClassName:   MiniApplication
 * @Date:        2019/6/17 12:59
 *         
 * @Author: Jiahui Zou
 * @Description: TODO
 **/

public class MiniApplication {

    public static void run(Class<?> cls , String[] args){
        System.out.println("hello world !!!");
        TomcatServer tomcatServer = new TomcatServer(args);
        try {
            tomcatServer.startServer();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
