package com.team5.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zyb on 2018/1/9.
 */
@Controller
public class Test {
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "zyb";
    }
}
