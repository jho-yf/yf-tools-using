package cn.jho.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JHO xu-jihong@qq.com
 * @date 2022-02-26 21:26
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("/redirect")
    public String redirect() {
        return "redirect";
    }

}
