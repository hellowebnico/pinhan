package com.pinhan.edu.src.controller;

/**
 * @author ARK
 * @create 2021-06-14 21:39
 */

import com.pinhan.edu.src.pojo.Grade;
import com.pinhan.edu.src.service.IGradeService;
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
@RequestMapping("/grade")
public class IGradeController {
    @Resource
    private IGradeService iGradeService;

    @PostMapping("/add")
    @ResponseBody
    public int addGrade(@Validated @RequestBody Grade grade) {
        return iGradeService.addGrade(grade);
    }
    @PostMapping("/update")
    @ResponseBody
    public int updateGrade(@Validated @RequestBody Grade grade) {
        return iGradeService.updateGrade(grade);
    }
    @RequestMapping("/select")
    @ResponseBody
    public Grade updateGrade(@RequestParam("studentId")String studentId) {
        return iGradeService.selectGrade(studentId);
    }

}
