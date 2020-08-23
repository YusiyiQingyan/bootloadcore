package com.weiwen.bootloadercore.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author weiwen
 * @email yusiyiqingyan@163.com
 * Created by weiwen on 2020/8/23
 */

public class HelloApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("...ApplicationContextInitializer...initialzer..." + configurableApplicationContext);

    }
}