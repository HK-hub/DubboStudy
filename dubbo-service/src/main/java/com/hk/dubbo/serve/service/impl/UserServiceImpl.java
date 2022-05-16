package com.hk.dubbo.serve.service.impl;

import com.hk.dubbo.domain.User;
import com.hk.dubbo.interf.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author : HK意境
 * @ClassName : UserServiceImpl
 * @date : 2022/5/14 16:42
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
// 将这个类提供的服务对外发布，将访问地址，IP，端口，路径注册到注册中心
// timeout 超时时间，retries 超市重试次数
// retries 当前服务超时，就会重试的次数，重试2次一共就是3次请求
// weight : 权重， 用于负载均衡时的随机使用
@Service(timeout = 2500 , retries = 2, version = "v1.0.0" , weight = 100)
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {

        return "你好，我是Dubbo, 很高兴遇见你，" + name ;
    }

    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setUsername("HK");
        user.setPassword(""+id);
        user.setAge(10+id);
        return user ;
    }
}
