package com.pinhan.edu.src.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pinhan.edu.src.pojo.Student;
import com.pinhan.edu.src.pojo.Teacher;
import com.pinhan.edu.src.pojo.User;
import com.pinhan.edu.src.service.ITeacherService;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
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

    @RequestMapping("/namePage")
    public IPage<Teacher> getPageByName(@RequestParam("name") @NotBlank String teacherName) {
        return teacherService.getPageByName(teacherName);
    }

    @PostMapping("/update")
    @ResponseBody
    public int updateTeacher(@Validated @RequestBody Teacher teacher) {
        return teacherService.updateTeacher(teacher);
    }

    @ResponseBody
    @RequestMapping("/del")
    public int delTeacher(@RequestParam("work_id") @NotBlank String workId) {
        return teacherService.delTeacher(workId);
    }
    @ResponseBody
    @PostMapping("/add")
    public int addTeacher(@Validated @RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }
}

