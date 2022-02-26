package cn.jho.swagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author JHO xu-jihong@qq.com
 * @date 2022-02-26 0:06
 */
@ApiModel(value = "用户实体类", description = "存储用户数据")
public class Person implements Serializable {

    @ApiModelProperty(value = "主键", name = "用户唯一标识", required = false, example = "1", hidden = false)
    private Integer id;

    @ApiModelProperty(value = "用户名", name = "用户名称", required = false, example = "张三", hidden = false)
    private String name;

    @ApiModelProperty(value = "年龄", name = "用户年龄", required = false, example = "18", hidden = false)
    private Integer age;

    public Person() {}

    public Person(Integer id) {
        this.id = id;
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
