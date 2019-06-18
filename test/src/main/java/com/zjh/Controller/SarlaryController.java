package com.zjh.Controller;

import com.zjh.beans.AutoWired;
import com.zjh.service.SalaryService;
import com.zjh.web.mvc.Controller;
import com.zjh.web.mvc.RequestMapping;
import com.zjh.web.mvc.RequestParam;

/**
 * @PackageName: com.zjh.Controller
 * @ClassName:   SarlaryController
 * @Date:        2019/6/17 15:24
 *         
 * @Author: Jiahui Zou
 * @Description: TODO
 **/

@Controller
public class SarlaryController {

    @AutoWired
    private SalaryService salaryService;

    @RequestMapping("/getSarlary.json")
    public Integer getSarlary(@RequestParam("name") String name , @RequestParam("exprience") String exprience){

        if(salaryService ==null){
            return 1100;
        }
        return salaryService.calSarlary(Integer.parseInt(exprience));
    }


}
