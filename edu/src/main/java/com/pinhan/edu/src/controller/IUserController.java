package com.pinhan.edu.src.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pinhan.edu.src.domain.UserForPassWord;
import com.pinhan.edu.src.pojo.User;
import com.pinhan.edu.src.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuyh
 * @since 2021-05-27
 */
@RestController
@RequestMapping("/user")
public class IUserController {
    @Resource
    private IUserService userService;
    @PostMapping("/login")
    @ResponseBody
    public int Login(@RequestBody @Validated User user){
        return userService.login(user.getWorkId(),user.getPassword());
    }
//    @PostMapping("/page")
//    @ResponseBody
//    public IPage<User> getPage(Integer currentPage){
//        return userService.getPage(currentPage);
//    }
    @RequestMapping("/page")
    public IPage<User> getPage(@RequestParam("page") Integer currentPage){
        return userService.getPage(currentPage);
    }
    @PostMapping("/reset")
    @ResponseBody
    public int resetPassWord(@Validated @RequestBody UserForPassWord user){
        return  userService.resetPassWord(user.getWorkId(),user.getNewPassWord());
    }

}

