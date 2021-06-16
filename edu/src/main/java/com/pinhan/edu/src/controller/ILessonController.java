package com.pinhan.edu.src.controller;


import com.pinhan.edu.src.pojo.Lesson;
import com.pinhan.edu.src.service.ILessonService;
import com.pinhan.edu.src.util.DateFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
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
    @Resource
    private DateFormat dateFormat;
    @PostMapping("/add")
    @ResponseBody
    public int addLesson(@Validated @RequestBody Lesson lesson){
        return iLessonService.addLesson(lesson);
    }
    @RequestMapping("/select")
    @ResponseBody
    public List<Lesson> selectLesson(@RequestParam("time") String time,
                                     @RequestParam("teacherName") String teacherName, @RequestParam("grade") String grade,
                                     @RequestParam("course") String course, @RequestParam("subject") String subject,
    @RequestParam("studentName") String studentName){
       return iLessonService.getLession(time,teacherName,grade,course,subject,studentName);
    }
    @PostMapping("/update")
    @ResponseBody
    public int updateLesson(@Validated @RequestBody Lesson lesson){
        return iLessonService.updateLesson(lesson);
    }
}

