package com.pinhan.edu.src.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pinhan.edu.src.pojo.Teacher;
import com.pinhan.edu.src.pojo.User;
import com.pinhan.edu.src.service.ITeacherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
@RestController
@RequestMapping("/teacher")
public class ITeacherController {
    @Resource
    private ITeacherService teacherService;
    @PostMapping("/page")
    @ResponseBody
    public IPage<Teacher> getPage(Integer currentPage){
        return teacherService.getPage(currentPage);
    }

}

