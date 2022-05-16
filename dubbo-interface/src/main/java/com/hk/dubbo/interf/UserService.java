package com.hk.dubbo.interf;

import com.hk.dubbo.domain.User;

/**
 * @author : HK意境
 * @ClassName : UserService
 * @date : 2022/5/14 16:42
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface UserService {

    public String sayHello(String name);

    public User findUserById(Integer id);

}
