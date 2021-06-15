package com.pinhan.edu.src.controller;


import com.pinhan.edu.src.pojo.Lesson;
import com.pinhan.edu.src.service.ILessonService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuyh
 * @since 2021-06-15
 */
@RestController
@RequestMapping("/lesson")
public class ILessonController {
    @Resource
    private ILessonService iLessonService;
    @PostMapping("/add")
    @ResponseBody
    public int addLesson(@Validated @RequestBody Lesson lesson){
        return iLessonService.addLesson(lesson);
    }
    @PostMapping("/select")
    @ResponseBody
    public List<Lesson> selectLesson(@Validated @RequestBody Lesson lesson){
       return iLessonService.getLession(lesson);
    }
    @PostMapping("/update")
    @ResponseBody
    public int updateLesson(@Validated @RequestBody Lesson lesson){

        return iLessonService.updateLesson(lesson);
    }
    @PostMapping("/check")
    @ResponseBody
    public int lessonCheck(@Validated @RequestBody Lesson lesson){
        return iLessonService.lessonCheck(lesson);
    }
}

