package com.pinhan.edu.src.controller;


import com.pinhan.edu.src.domain.Lessons;
import com.pinhan.edu.src.pojo.Lesson;
import com.pinhan.edu.src.service.ILessonService;
import com.pinhan.edu.src.util.DateFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
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
    public List<Lessons> selectLesson(@RequestParam("time") String time,
                                     @RequestParam("teacherName") String teacherName, @RequestParam("grade") String grade,
                                     @RequestParam("course") String course, @RequestParam("subject") String subject,
    @RequestParam("studentName") String studentName){
        List<Lesson> lesson = iLessonService.getLession(time,teacherName,grade,course,subject,studentName);
        List<Lessons> list = new ArrayList<>();
        Lessons l1 = new Lessons();
        Lessons l2 = new Lessons();
        Lessons l3 = new Lessons();
        Lessons l4 = new Lessons();
        Lessons l5 = new Lessons();
        Lessons l6 = new Lessons();
        Lessons l7 = new Lessons();
        l1.setWeek("1");
        l2.setWeek("2");
        l3.setWeek("3");
        l4.setWeek("4");
        l5.setWeek("5");
        l6.setWeek("6");
        l7.setWeek("7");
        String[] times = time.split(",");
        String[] t1 = times[0].split("-");
        System.out.println(t1);
        String d1 = t1[1] + "月" + t1[2] + "日";
        l1.setDate(d1);
        String[] t2 = times[1].split("-");
        String d2 = t2[1] + "月" + t2[2] + "日";
        l2.setDate(d2);
        String[] t3 = times[2].split("-");
        String d3 = t3[1] + "月" + t3[2] + "日";
        l3.setDate(d3);
        String[] t4 = times[3].split("-");
        String d4 = t4[1] + "月" + t4[2] + "日";
        l4.setDate(d4);
        String[] t5 = times[4].split("-");
        String d5 = t5[1] + "月" + t5[2] + "日";
        l5.setDate(d5);
        String[] t6 = times[5].split("-");
        String d6 = t6[1] + "月" + t6[2] + "日";
        l6.setDate(d6);
        String[] t7 = times[6].split("-");
        String d7 = t7[1] + "月" + t7[2] + "日";
        l7.setDate(d7);
        List<Lesson> list1 = new ArrayList<>();
        List<Lesson> list2 = new ArrayList<>();
        List<Lesson> list3 = new ArrayList<>();
        List<Lesson> list4 = new ArrayList<>();
        List<Lesson> list5 = new ArrayList<>();
        List<Lesson> list6 = new ArrayList<>();
        List<Lesson> list7 = new ArrayList<>();
        lesson.stream().forEach(data->
                {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String s = sdf.format(data.getDate());
                String [] ss = s.split("-");
                String str = ss[1] + "月" + ss[2] + "日";
                    System.out.println(str);
                if(str.equals(d1)){
                    list1.add(data);
                }else if(str.equals(d2)){
                    list2.add(data);
                }else if(str.equals(d3)){
                    list3.add(data);
                }else if(str.equals(d4)){
                    list4.add(data);
                }else if(str.equals(d5)){
                    list5.add(data);
                }else if(str.equals(d6)){
                    list6.add(data);
                }else if(str.equals(d7)){
                    list7.add(data);
                }

        });
        l1.setCourses(list1);
        l2.setCourses(list2);
        l3.setCourses(list3);
        l4.setCourses(list4);
        l5.setCourses(list5);
        l6.setCourses(list6);
        l7.setCourses(list7);
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        return list;
    }
    @PostMapping("/update")
    @ResponseBody
    public int updateLesson(@Validated @RequestBody Lesson lesson){
        return iLessonService.updateLesson(lesson);
    }
}

