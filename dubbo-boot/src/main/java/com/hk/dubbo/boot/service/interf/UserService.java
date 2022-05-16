package com.hk.dubbo.boot.service.interf;

import com.hk.dubbo.domain.User;
import org.apache.dubbo.config.annotation.Method;

/**
 * @author : HK意境
 * @ClassName : UserService
 * @date : 2022/5/15 16:42
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface UserService {

    public User findUserById(Integer id);

}
