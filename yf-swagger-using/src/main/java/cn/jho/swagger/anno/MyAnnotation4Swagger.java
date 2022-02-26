package cn.jho.swagger.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义Swagger注解
 *
 * @author JHO xu-jihong@qq.com
 * @date 2022-02-26 16:48
 */
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation4Swagger {

    // 自定义注解中的属性。相当于@MyAnnotation4Swagger(value="")
    String value() default "";

}
