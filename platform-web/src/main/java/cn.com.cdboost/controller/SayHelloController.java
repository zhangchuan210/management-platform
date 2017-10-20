package cn.com.cdboost.controller;

import cn.com.cdboost.service.DemoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zc
 * @desc
 * @create 2017-10-18 15:21
 **/
@Controller
@RequestMapping("/test")
public class SayHelloController {
    private static final Logger logger = Logger.getLogger(SayHelloController.class);
    @Autowired
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        logger.info("===========================begin");
        //像调用本地方法一样调用远程服务
        String sayHello = demoService.sayHello("Tom");
        logger.info("===========================end " + sayHello);
        System.out.println(sayHello);
        return "result";
    }
}
