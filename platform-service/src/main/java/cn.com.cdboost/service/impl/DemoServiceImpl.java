package cn.com.cdboost.service.impl;


import cn.com.cdboost.service.DemoService;

/**
 * @author zc
 * @desc
 * @create 2017-10-18 10:12
 **/
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}