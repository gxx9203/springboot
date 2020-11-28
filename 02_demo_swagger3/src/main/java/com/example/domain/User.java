package com.example.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("(User) User实体类")
public class User {
    @ApiModelProperty("id")
    public Long id;
    @ApiModelProperty("name 名字")
    public String name;
    @ApiModelProperty("age 年龄")
    public Integer  age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
