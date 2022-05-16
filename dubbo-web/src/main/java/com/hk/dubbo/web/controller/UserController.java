package com.hk.dubbo.web.controller;

import com.hk.dubbo.interf.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.cluster.loadbalance.RandomLoadBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : HK意境
 * @ClassName : UserController
 * @date : 2022/5/14 16:52
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@RestController
public class UserController {

    /***
     *      从注册中心获取到 userService 的访问路径
     *      进行 RPC 远程过程调用
     *      将结果封装为一个代理对象，给变量赋值
     */
    /**
     * 负载均衡策略：Dubbo 里面提供了负载均衡的支持，提供了三种策略：
     *      - Random ：按权重来进行随机分发请求, RandomLoadBalance.NAME 类提供，
     *      - RoundRobin : 按权重来进行轮询，
     */
    @Reference(timeout = 1000, retries = 2, version = "v1.0.0", loadbalance = RandomLoadBalance.NAME)
    private UserService userService ;



    @RequestMapping("/hello")
    public String sayHello(){

        String res = userService.sayHello("HK意境");

        return res;
    }


}
