package com.example.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jie.sun on 2018/9/5.
 */
@Component
@ConfigurationProperties(prefix = "hello")
public class WordSetting {
    private String word;

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
