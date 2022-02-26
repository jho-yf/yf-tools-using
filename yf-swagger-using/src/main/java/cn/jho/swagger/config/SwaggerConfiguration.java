package cn.jho.swagger.config;

import cn.jho.swagger.anno.MyAnnotation4Swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;



/**
 * @author JHO xu-jihong@qq.com
 * @date 2022-02-26 16:28
 */
@Configuration
public class SwaggerConfiguration {

    /**
     * Docket是swagger的全局配置对象
     * @return {@link Docket}
     */
    @Bean
    public Docket docket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        // name     文档发布者名称
        // url      文档发布者网站地址。企业网站
        // email    文档发布者的电子邮箱
        Contact contact = new Contact("乙方小弟",
                "https://github.com/jho-yf",
                "xu-jihong@qq.com");
        ApiInfo apiInfo = new ApiInfoBuilder()
                .contact(contact)
                .title("Swagger学习文档")
                .description("Swagger框架帮助文档详细描述")
                .version("1.1")
                .build();

        // 添加api描述信息
        docket.apiInfo(apiInfo);

        // 获取Docket中的选择器
        docket = docket.select()
                // 当方法上有注解时返回false
                .apis(RequestHandlerSelectors.withMethodAnnotation(MyAnnotation4Swagger.class).negate())
                // 设定扫描哪个包中的注解
                .apis(RequestHandlerSelectors.basePackage("cn.jho.swagger.controller"))
                // 使用正则表达式，约束生成API文档的路径地址
                .paths(PathSelectors.regex("/person/*.*").or(PathSelectors.regex("/home/*.*")))
                .build();

        return docket;
    }

}
