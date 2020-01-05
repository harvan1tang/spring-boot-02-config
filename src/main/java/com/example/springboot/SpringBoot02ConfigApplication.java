package com.example.springboot;

import com.example.springboot.bean.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * @ImportResource(locations = {"classpath:spring01.xml"})
 *  用于导入spring的配置文件，并将它加载到容器中
 */
@ImportResource(locations = {"classpath:spring01.xml"})
@SpringBootApplication
public class SpringBoot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02ConfigApplication.class, args);
    }


    //工厂
//    @Bean
//    @ConfigurationProperties(prefix = "student")
//    public Student student(){
//        return new Student();
//    }
//    @Bean
//    @ConfigurationProperties(prefix = "student1")
//    public Student student1(){
//        return new Student();
//    }
}
