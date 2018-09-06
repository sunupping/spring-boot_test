package com.example.demo.controller;

import com.example.demo.domain.AuthorSettings;
import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jie.sun on 2018/9/5.
 */
@RestController //controller里面的方法都以json格式输出，不用再写什么jackjson配置的了
public class HelloWorldController {

//    @Value("${book.author}")
//    private String bookAuthor;
//    @Value("${book.name}")
//    private String bookName;
    @Autowired
    AuthorSettings authorSettings;
    @Autowired
    HelloService helloService;

    @RequestMapping("/") //访问路径的映射
    public String index(){
//        return "author name is:"+authorSettings.getName()+" an author age is:"+authorSettings.getAge();
        return helloService.sayHello();
    }
}
