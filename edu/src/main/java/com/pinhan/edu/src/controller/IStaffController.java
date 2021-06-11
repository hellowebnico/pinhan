package com.pinhan.edu.src.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pinhan.edu.src.pojo.Staff;
import com.pinhan.edu.src.pojo.Stream;
import com.pinhan.edu.src.pojo.Student;
import com.pinhan.edu.src.service.IStaffService;
import com.pinhan.edu.src.service.IStudentService;
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
@RequestMapping("/staff")
public class IStaffController {
    @Resource
    private IStaffService iStaffService;

    @RequestMapping("/page")
    public IPage<Staff> getPage(@RequestParam("page") Integer currentPage) {
        return iStaffService.getPage(currentPage);
    }
}

