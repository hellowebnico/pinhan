package com.pinhan.edu.src.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pinhan.edu.src.pojo.Student;
import com.pinhan.edu.src.pojo.User;
import com.pinhan.edu.src.service.IStudentService;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/student")
public class IStudentController {
    @Resource
    private IStudentService studentService;
//    @PostMapping("/page")
//    @ResponseBody
//    public IPage<Student> getPage(Integer currentPage){
//        return studentService.getPage(currentPage);
//    }
    @RequestMapping("/page")
    public IPage<Student> getPage(@RequestParam("page") Integer currentPage){
        return studentService.getPage(currentPage);
    }

}

