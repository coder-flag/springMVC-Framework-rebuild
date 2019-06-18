package com.zjh.beans;

import java.lang.annotation.*;

/**
 * @PackageName: com.zjh.beans
 * @ClassName:   AutoWired
 * @Date:        2019/6/18 14:14
 *         
 * @Author: Jiahui Zou
 * @Description: TODO
 **/

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AutoWired {
}
