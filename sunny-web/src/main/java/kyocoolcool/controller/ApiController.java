package kyocoolcool.controller;

import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName controller
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-08-19 16:40
 * @Version 1.0
 **/
@RestController
public class ApiController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        System.out.println("hello");
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello, {}!", who);
    }
}