package com.zjh.web.handler;

import com.zjh.web.mvc.Controller;
import com.zjh.web.mvc.RequestMapping;
import com.zjh.web.mvc.RequestParam;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: com.zjh.web.handler
 * @ClassName:   HandlerManager
 * @Date:        2019/6/18 13:20
 *         
 * @Author: Jiahui Zou
 * @Description: TODO
 **/

public class HandlerManager {
    public static List<MappingHandler> mappingHandlers = new ArrayList<>();

    public static void resolveMappingHandler(List<Class<?>> classList){
        for(Class<?> cls : classList){
            if(cls.isAnnotationPresent(Controller.class)){
                parseHandlerFromController(cls);
            }
        }
    }

    private static void  parseHandlerFromController(Class<?> cls){
        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
            if(!method.isAnnotationPresent(RequestMapping.class)){
                continue;
            }

            String uri = method.getDeclaredAnnotation(RequestMapping.class).value();
            List<String> paramNameList = new ArrayList<>();
            for(Parameter parameter : method.getParameters()){
                if(parameter.isAnnotationPresent(RequestParam.class)){
                    paramNameList.add(parameter.getDeclaredAnnotation(RequestParam.class).value());
                }
            }
            String[] params = paramNameList.toArray(new String[paramNameList.size()]);
            MappingHandler mappingHandler = new MappingHandler(uri,method ,cls ,params );
            HandlerManager.mappingHandlers.add(mappingHandler);
        }
    }
}


