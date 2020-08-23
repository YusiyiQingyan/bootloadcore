package com.weiwen.bootloadercore.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author weiwen
 * @email yusiyiqingyan@163.com
 * Created by weiwen on 2020/8/23
 */
@Component
public class HelloCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("commondLineRunner...run....");
    }
}