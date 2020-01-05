package com.example.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties 告诉SpringBoot将配置文件中的对应属性值，映射到这个组件类中，
 * 进行一一绑定
 *  prefix = "student" ： 配置文件中的前缀名，配置了哪个前缀就会与下面的所有属性进行一一映射
 *
 *
 *  @PropertySource ： 加载局部配置文件，
 * @Title: Student
 * @Description: com.example.springboot.bean
 * @Auther: www.example.com
 * @Version: 1.0
 */
@PropertySource(value = {"classpath:student.properties"})
@Validated
@Configuration

//组件：spring工厂负责组件的生成与装配，@Service，@RestController，@Controller，@Mapper
@ConfigurationProperties(prefix = "student")//前置
public class Student {

    /***
     * 类似于Spring框架中使用配置文件中的数据注入方式
     *  <bean class="Student">
     *      <property name="name" value="字面量/#{SpEL} spring表达式/${key}从配置文件中获取"></property>
     *  </bean>
     */
//    @Value("${student.id}")
    private Integer id;
    //    @Value("${student.name}")
    private String lastName;
    //    @Value("#{10*2}")
    private Integer age;

    //    @Email
//    @Value("${student.email}")
    private String email;

    private Map map;

    private List list;

    private Language language;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", map=" + map +
                ", list=" + list +
                ", language=" + language +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
