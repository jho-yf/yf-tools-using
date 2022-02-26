package cn.jho.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 *
 * @author JHO xu-jihong@qq.com
 * @date 2022-02-25 23:53
 */
@SpringBootApplication
@EnableSwagger2
public class SwaggerUsingApp {

    /*
        @EnableSwagger2是SpringFox提供的一个注解，代表Swagger2相关技术开启，会扫描当前类所在包以及子包所有的类型中的注解。
     */

    public static void main(String[] args) {
        SpringApplication.run(SwaggerUsingApp.class, args);
    }

}
