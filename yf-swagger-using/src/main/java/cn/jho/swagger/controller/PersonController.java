package cn.jho.swagger.controller;

import cn.jho.swagger.anno.MyAnnotation4Swagger;
import cn.jho.swagger.pojo.Person;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * @author JHO xu-jihong@qq.com
 * @date 2022-02-25 23:46
 */
@RestController
@RequestMapping("/person")
@Api(tags = {"PersonController", "用户业务控制器"})
public class PersonController {

    @PostMapping
    @ApiOperation(value = "新增用户", notes = "为当前业务新增一个用户")
    public Person add(Person person) {
        return person;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取用户", notes = "根据id查询用户并返回")
    @ApiImplicitParam(name = "id", value = "id描述", paramType = "path")
    public Person get(@PathVariable @ApiParam(name = "用户id", value = "用户唯一标识", required = true) Integer id) {
        return new Person(id);
    }

    @GetMapping
    @ApiOperation(value = "用户列表", notes = "筛选用户列表")
    // @ApiImplicitParam(name = "name", value = "用户名称", paramType = "query")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "name", value = "用户名称", paramType = "query"),
            @ApiImplicitParam(name = "age", value = "年龄", paramType = "query"),
    })
    public List<Person> find(@RequestParam @ApiParam(name = "用户名", value = "模糊匹配用户名", required = false) String name,
                            @RequestParam @ApiParam(name = "年龄", value = "精确匹配年龄", required = false) Integer age) {
        return Collections.singletonList(new Person(1, name, age));
    }

    @MyAnnotation4Swagger
    @RequestMapping("/req")
    public String req(String m) {
        return "【req】" + m;
    }

}
