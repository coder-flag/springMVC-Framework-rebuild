package com.zjh.starter;

import com.zjh.core.ClassScanner;
import com.zjh.web.server.TomcatServer;
import org.apache.catalina.LifecycleException;

import java.io.IOException;
import java.util.List;

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
            List<Class<?>> classList = ClassScanner.scamClasses(cls.getPackage().getName());
            classList.forEach(it->System.out.println(it.getName()));
        } catch (LifecycleException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
