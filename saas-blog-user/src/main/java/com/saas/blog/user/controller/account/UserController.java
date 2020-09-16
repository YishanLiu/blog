package com.saas.blog.user.controller.account;

import com.blog.member.User;
import com.holderzone.framework.util.JacksonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.codec.json.Jackson2CodecSupport;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
@Api(description = "微博用户相关接口")
public class UserController {


    @ApiOperation(value = "查询单个用户", notes = "查询单个用户")
    @PostMapping("selectUser")
    public User selectUser(@RequestBody User user) {
        log.info("查询单个用户入参:{}", JacksonUtils.writeValueAsString(user));
        return new User().setNickName("热血青年").setUserName("刘裔山");
    }


}
