package com.example.demo.service;

import com.example.demo.domain.WordSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jie.sun on 2018/9/5.
 */
@Service
public class HelloService {
    @Autowired
    WordSetting wordSetting;

    public String sayHello(){
        return "hello " + wordSetting.getWord();
    }
}
