package com.pinhan.edu.src.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pinhan.edu.src.pojo.Staff;
import com.pinhan.edu.src.pojo.Student;
import com.pinhan.edu.src.service.IStudentService;
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
@RequestMapping("/student")
public class IStudentController {
    @Resource
    private IStudentService studentService;

    @RequestMapping("/page")
    public IPage<Student> getPage(@RequestParam("page") Integer currentPage) {
        return studentService.getPage(currentPage);
    }
    @PostMapping("/add")
    @ResponseBody
    public int addStudent(@RequestBody @Validated Student student) {
        return studentService.addStudent(student);
    }

}

