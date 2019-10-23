package cn.itacst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("login")
    @ResponseBody
    public String userLogin()
    {
        System.out.println("用户登录界面");
        return "nihao";
    }
}
