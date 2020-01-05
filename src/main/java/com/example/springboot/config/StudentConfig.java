package com.example.springboot.config;

import com.example.springboot.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 它是spring里的注解，用于标识当前类是一个配置类，来表示对应spirng配置文件
 * @Title: StudentConfig
 * @Description: com.example.springboot.config
 * @Auther: www.example.com
 * @Version: 1.0
 */
@Configuration
public class StudentConfig {
    /**
     * @Bean 标识的方法用于向容器中注入组件
     * 1. 返回值就是注入容器中的组件对象
     * 2. 方法名就是这个组件的 id 值
     * @return
     */
    @Bean
    public StudentService studentService() {
        System.out.println(" StudentService 组件注入成功");
        return new StudentService();
    }
}
