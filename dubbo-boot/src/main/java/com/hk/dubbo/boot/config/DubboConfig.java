package com.hk.dubbo.boot.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : HK意境
 * @ClassName : DubboConfig
 * @date : 2022/5/15 16:30
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Configuration
public class DubboConfig {

    @Value("${spring.application.name}")
    private String applicationName;

    // 配置 服务提供方的应用配置
    public ApplicationConfig applicationConfig(){

        ApplicationConfig appConf = new ApplicationConfig();
        appConf.setName(applicationName);
        return appConf ;
    }

    // 配置 dubbo 配置
    @Bean
    public ProtocolConfig protocolConfig(){

        ProtocolConfig protocolConfig = new ProtocolConfig();

        // 设置 RPC 服务提供方的使用的协议名称： Dubbo
        protocolConfig.setName("Dubbo");
        protocolConfig.setPort(20882);

        return protocolConfig ;
    }


    // 配置 注册中心的配置
    @Bean
    public RegistryConfig registryConfig(){

        RegistryConfig config = new RegistryConfig();
        config.setProtocol("zookeeper");
        config.setAddress("127.0.0.1:2181");

        return config ;
    }





}
