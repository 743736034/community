package com.nowcoder.community.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype") //默认单例singleton，也就是只有一个实例；prototype是多例，每次访问Bean，都创建一个实例。
public class AlphaService {

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }
    @PostConstruct  //在构造器之后调用
    public void init(){
        System.out.println("初始化AlphaService");
    }
    @PreDestroy //销毁之前调用，可以释放一些资源
    public void destroy(){
        System.out.println("销毁AlphaService");
    }

}
