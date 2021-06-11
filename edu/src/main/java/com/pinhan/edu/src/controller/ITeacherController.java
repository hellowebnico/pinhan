package com.pinhan.edu.src.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pinhan.edu.src.pojo.Student;
import com.pinhan.edu.src.pojo.Teacher;
import com.pinhan.edu.src.pojo.User;
import com.pinhan.edu.src.service.ITeacherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
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

    @RequestMapping("/page")
    public IPage<Teacher> getPage(@RequestParam("page") Integer currentPage) {
        return teacherService.getPage(currentPage);
    }

}

