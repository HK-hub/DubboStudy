package com.hk.dubbo.boot.service.interf.impl;

import com.hk.dubbo.boot.service.interf.UserService;
import com.hk.dubbo.domain.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.rpc.cluster.loadbalance.RandomLoadBalance;

/**
 * @author : HK意境
 * @ClassName : UserServiceImpl
 * @date : 2022/5/15 16:56
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@DubboService(timeout = 3000, retries = 2, version = "v1.0", loadbalance = RandomLoadBalance.NAME)
public class UserServiceImpl implements UserService {



    @Override
    public User findUserById(Integer id) {

        User user = new User();
        user.setUsername(""+id);
        user.setPassword("10+"+id);
        return user;

    }
}
