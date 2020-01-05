package com.example.springboot.bean;

/**
 * @Title: Language
 * @Description: com.example.springboot.bean
 * @Auther: www.example.com
 * @Version: 1.0
 */
public class Language {
    private String name;
    private Integer level;

    @Override
    public String toString() {
        return "Language{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
