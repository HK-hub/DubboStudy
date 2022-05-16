package com.hk.dubbo.domain;

import java.io.Serializable;

/**
 * @author : HK意境
 * @ClassName : User
 * @date : 2022/5/15 13:19
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class User implements Serializable {

    private String username ;
    private String password ;
    private Integer age ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
