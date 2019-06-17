package com.zjh.web.mvc;

import javax.xml.bind.Element;
import java.lang.annotation.*;

/**
 * @PackageName: com.zjh.web.mvc
 * @ClassName: RequestParam
 * @Date: 2019/6/17 15:15
 * @Author: Jiahui Zou
 * @Description: TODO
 **/

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface RequestParam {
    String value();
}
