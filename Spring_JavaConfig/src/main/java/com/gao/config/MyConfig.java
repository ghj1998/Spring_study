package com.gao.config;

import com.gao.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.gao.pojo")
@Import({MyConfig2.class,MyConfig3.class})
public class MyConfig {
    public Dog dog(){
        return new Dog();
    }
}
