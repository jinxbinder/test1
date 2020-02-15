package com.bin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: DemoController <br/>
 * Description: <br/>
 * date: 2020/1/19 17:44<br/>
 *
 * @author libd<br />
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
