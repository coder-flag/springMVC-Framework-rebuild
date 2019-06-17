package com.zjh;

import com.zjh.starter.MiniApplication;

/**
 * @PackageName: com.zjh
 * @ClassName:   Application
 * @Date:        2019/6/17 12:54
 *         
 * @Author: Jiahui Zou
 * @Description: TODO
 **/

public class Application {
    public static void  main(String[] args){
        System.out.println("Hello world !");
        MiniApplication.run(Application.class,args);
    }
}
