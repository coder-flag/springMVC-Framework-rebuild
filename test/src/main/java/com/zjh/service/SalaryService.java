package com.zjh.service;

import com.zjh.beans.Bean;

/**
 * @PackageName: com.zjh
 * @ClassName:   SalaryService
 * @Date:        2019/6/18 14:43
 *         
 * @Author: Jiahui Zou
 * @Description: TODO
 **/

@Bean
public class SalaryService {

    public Integer calSarlary(Integer experience){
        return 5000*experience;
    }
}
