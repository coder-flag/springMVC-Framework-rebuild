package com.zjh.web.mvc;

import java.lang.annotation.*;

/**
 * @PackageName: com.zjh.web.mvc
 * @ClassName:   RequestMapping
 * @Date:        2019/6/17 15:12
 *         
 * @Author: Jiahui Zou
 * @Description: TODO
 **/


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequestMapping {
    String value();
}
