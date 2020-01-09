package com.aaa.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * fileName:JenkinsController
 * description:
 * author:xxx
 * createTime:2020/1/8 21:51
 * version:1.0.0
 */
@RestController
@RequestMapping("testJenkins")
public class JenkinsController {
    /**
     * 打印信息
     * @return
     */
    @RequestMapping("print")
    public Object printInfo(){
        Map map =new HashMap();
        map.put("code",200);
        map.put("message","success");
        map.put("jenkins","CI SoftWare");
        return map;
    }

}
